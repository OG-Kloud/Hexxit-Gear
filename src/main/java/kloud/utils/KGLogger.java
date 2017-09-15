package kloud.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class KGLogger {
	
	private static final boolean debug = false;
	private static final Logger logger = LogManager.getLogger("HexxitGear");
	private static final String newLine = "\n====================\n";
	
	
	
	public static void log(final String msg, boolean overrideDebug) {
		if(debug | overrideDebug) {
			System.out.println(newLine);
			logger.info(msg);
			System.out.println(newLine);
		}
	}

}
