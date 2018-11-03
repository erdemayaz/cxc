package cxc;

import static java.lang.System.exit;

/**
 *
 * @author Erdem Ayaz
 */
public class Error {
    public static final int NEED_PARAMETER = 10;
    public static final int UNAVAIBLE_EXTENSION = 11;
    public static final int EMPTY_SOURCE = 12;
    public static final int READING_EXCEPTION = 13;
    public static final int PARSER_ERROR = 13;
    
    public static void message(int code, String text) {
        System.err.println("[" + code + "] " + text);
        exit(0);
    }
    public static void message(int code, String text, int line) {
        System.err.println("[" + code + "] " + text + " on line " + line);
        exit(0);
    }
}
