package cxc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Erdem Ayaz
 */
public class CXC {
    
    public static void main(String[] args) {
        ExecutorService ex;
        if(args.length > 0) {
            ex = Executors.newFixedThreadPool(Runtime.
                    getRuntime().availableProcessors());
            for(String arg : args) {
                Interpreter i = new Interpreter(arg);
                ex.submit(i);
            }
            ex.shutdown();
        } else {
            System.err.println("Need parameter");
        }
    }
    
}
