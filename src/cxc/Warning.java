package cxc;

/**
 *
 * @author Erdem Ayaz
 */
public class Warning {
    private final int code;
    private int line = -1;
    private String message = null;

    public Warning(int code, int line, String message) {
        this.code = code;
        this.line = line;
        this.message = message;
    }
    
    public Warning(int code, int line) {
        this.code = code;
        this.line = line;
    }
    
    public Warning(int code, String message) {
        this.code = code;
        this.message = message;
    }
    
    public Warning(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public int getLine() {
        return line;
    }

    public String getMessage() {
        return message;
    }
    
    public static void message(Warning w) {
        if(w.getMessage() != null) {
            if(w.getLine() != -1) {
                System.out.println("[" + w.getCode() + "] Warning: " + 
                        w.getMessage() + " on line " + w.getLine());
            } else {
                System.out.println("[" + w.getCode() + "] Warning: " + 
                        w.getMessage());
            }
        } else {
            if(w.getLine() != -1) {
                System.out.println("[" + w.getCode() + "] Warning on line " + 
                        w.getLine());
            } else {
                System.out.println("[" + w.getCode() + "] Warning");
            }
        }
    }
}
