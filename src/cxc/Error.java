package cxc;

import static java.lang.System.exit;

/**
 *
 * @author Erdem Ayaz
 */
public class Error {
    public static final int NEED_PARAMETER        = 10;
    public static final int UNAVAIBLE_EXTENSION   = 11;
    public static final int EMPTY_SOURCE          = 12;
    public static final int READING_EXCEPTION     = 13;
    public static final int PARSER_ERROR          = 14;
    public static final int MULTIPLE_IDENTIFIER   = 15;
    public static final int OVERLOADING_ERROR     = 16;
    public static final int INCOMPATIBLE_MODIFIER = 17;
    public static final int CONSTRUCTOR_SPECIFIER = 18;
    public static final int MULTIPLE_CONSTRUCTOR  = 19;
    public static final int MULTIPLE_ASSIGNMENT   = 20;
    public static final int NOT_FOUND_UNARY       = 21;
    public static final int MEMBER_START_ERROR    = 22;
    public static final int NO_MAIN               = 23;
    public static final int NO_INITIALIZER_LIST   = 24;
    public static final int HAS_INITIALIZER       = 25;
    public static final int INCORRECT_ASSIGNMENT  = 26;
    public static final int NO_TYPE               = 27;
    public static final int NO_SPECIFIER          = 28;
    public static final int NO_FUNCTION           = 29;
    public static final int NO_DECLARATION        = 30;
    public static final int NO_VERTEX             = 31;
    
    public static void message(int code, String text) {
        System.err.println("[" + code + "] Error: " + text);
        exit(0);
    }
    public static void message(int code, String text, int line) {
        System.err.println("[" + code + "] Error: " + text + " on line " + line);
        exit(0);
    }
}
