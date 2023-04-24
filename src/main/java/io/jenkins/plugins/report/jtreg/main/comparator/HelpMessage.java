package io.jenkins.plugins.report.jtreg.main.comparator;

final public class HelpMessage {
    public static final String HELP_MESSAGE =
           //80-characters-long-comment------------------------------------------------------
            "Test Variant Comparator Usage: java -cp <classpaths> <mainclass> [arguments...]\n" +
            "\n" +
            "Where mainclass is:\n" +
            "    io.jenkins.plugins.report.jtreg.main.comparator.VariantComparator\n" +
            "\n" +
            "And arguments include:\n" +
            "\n" +
            "    These two arguments are mandatory:\n" +
            "    --path <path/to/jenkins/jobs>\n" +
            "                  A system path to a directory with your jenkins jobs.\n" +
            "    --query <querystring>\n" +
            "                  A query string to filter the jobs (the syntax is described\n" +
            "                  below).\n" +
            "\n" +
            "    You need to choose ONE operation from these:\n" +
            "    --print       Print all jobs and their builds that match the rest of\n" +
            "                  arguments, without actually doing any operation on the builds\n" +
            "                  or tests.\n" +
            "    --enumerate   Print lists of all variants of jobs (that match the rest of\n" +
            "                  arguments).\n" +
            "    --list        Print a table of matched jobs with their builds and the tests\n" +
            "                  that failed in the build.\n" +
            "    --compare     Print a table of all failed tests (of matched job builds) and\n" +
            "                  the builds where they failed.\n" +
            "\n" +
            "    Other arguments:\n" +
            "    --help        Print this help message.\n" +
            "    --skip-failed=<true/false>\n" +
            "                  Specify whether the comparator should skip failed tests\n" +
            "                  (only take successful and unstable) or take all. The\n" +
            "                  default value is true.\n" +
            "    --nvr <nvrquery>\n" +
            "                  To specify what builds to take (only builds with specified\n" +
            "                  NVRs). The syntax is described below\n" +
            "    --history <number>\n" +
            "                  To specify the maximum number of builds to look in.\n" +
            "    --exact-length <number>\n" +
            "                  Since job names can have different lengths and sometimes\n" +
            "                  we only need to match jobs with exact name length (number\n" +
            "                  of element in the job name), this specifies the exact\n" +
            "                  length." +
            "    --only-volatile=<true/false>\n" +
            "                  Specify true to show only non stable tests with the arguments\n" +
            "                  list and compare (shows only tests, that are NOT failed\n" +
            "                  everywhere). The default value is false." +
            "\n" +
            "Query string syntax:\n" +
            "    The tool splits every job name by . or - characters and compares each\n" +
            "    split part with the query string. The query string consists of N parts\n" +
            "    separated by spaces (or other whitespace) and each of these parts\n" +
            "    corresponds with 1st..Nth part of the split job name.\n" +
            "    Example with explanation:\n" +
            "     \"jtreg~full jp17 * {f37,el8} !aarch64 !{fastdebug,slowdebug} * * *\"\n" +
            "        jtreg~full - specifies that the job's first part should be exactly\n" +
            "                     jtreg~full.\n" +
            "        jp17 - specifies that the job's second part should be exactly jp17.\n" +
            "        * - asterisk is a powerful wildcard that matches everything, so in\n" +
            "            this example, the job's parts on the 3rd, 7th, 8th and 9th don't\n" +
            "            matter = the tool takes everything on these positions.\n" +
            "            To stop the tool from draining system resources by looking at\n" +
            "            all jobs, if you specify more than 3 asterisks, you must combine\n" +
            "            it with the switch \"--force\".\n" +
            "        {f37,el8} - this is a set of possible matches, so the jobs's part on\n" +
            "                    4th position can be either f37 or el8. There can me as\n" +
            "                    many elements as you want, but they must be split by\n" +
            "                    commas with no spaces between them.\n" +
            "        !aarch64 - matches everything, BUT aarch64.\n" +
            "        !{fastdebug,slowdebug} - matches everything, but the elements in\n" +
            "                                 the set.\n" +
            "\n" +
            "NVR query syntax:\n" +
            "    The syntax of the NVR query is simple: it either takes an asterisk (*)\n" +
            "    all NVRs, or it takes a RegEx of a single NVR it should match, or\n" +
            "    multiple RegExes in a set ({}) with same rules as the query string set.\n";
}
