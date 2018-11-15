package cxc;

import static java.lang.System.exit;

/**
 *
 * @author Erdem Ayaz
 */
public class Error {    
    public static void message(int code, String text) {
        System.err.println("[" + code + "] Error: " + text);
        exit(0);
    }
    public static void message(int code, String text, int line) {
        System.err.println("[" + code + "] Error: " + text + " on line " + line);
        exit(0);
    }
}
