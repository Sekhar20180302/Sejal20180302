package explicitPackage;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


// Download Log4j jar file from the below link
// http://www.java2s.com/Code/Jar/l/Downloadlog4jjar.htm
public class Log4j2Example {

    private static Logger Log = LogManager.getLogger(Log4j2Example.class);

    public static void info(String message) {
        Log.info(message);
        }
public static void warn(String message) {
    Log.warn(message);
    }
public static void error(String message) {
    Log.error(message);
    }
public static void fatal(String message) {
    Log.fatal(message);
    }
public static void debug(String message) {
    Log.debug(message);
    }
}