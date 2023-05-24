package io.jenkins.plugins.report.jtreg.main.comparator.formatters;


import java.io.PrintStream;
import java.util.Arrays;

public class PlainTable implements TablePrinter {
    private final PrintStream ps;

    public PlainTable(PrintStream printStream) {
        this.ps = printStream;
    }

    public void printTable(String[][] table, int rowSize, int columnSize) {
        // first print the first row definitions
        for (int i = 1; i < table[0].length; i++) {
            ps.println(i + ") " + table[0][i]);
            table[0][i] = Integer.toString(i); // replace the item with its definition (number)
        }

        // get the length of the longest item in each column
        int[] lengths = new int[table[0].length];
        Arrays.fill(lengths, 0);
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                if (table[i][j] != null && table[i][j].length() > lengths[j]) {
                    lengths[j] = table[i][j].length();
                }
            }
        }

        // print the table
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                int len = 0;
                if (table[i][j] != null) {
                    ps.print(table[i][j] + " ");
                    len = table[i][j].length();
                } else {
                    ps.print(" ");
                }
                // printing spaces to make the table look better
                for (int k = len; k < lengths[j]; k++) {
                    ps.print(" ");
                }
                ps.print("| ");
            }
            ps.print("\n");
        }
    }
}