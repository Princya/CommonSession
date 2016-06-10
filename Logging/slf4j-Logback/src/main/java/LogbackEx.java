

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;


public class LogbackEx {
private static final Logger logger = (Logger) LoggerFactory.getLogger(LogbackEx.class);

	String message(String message){
		
		return message;
	}
	public static void main(String[] args) {
		logger.trace("This is trace message");
		
		LogbackEx ex=new LogbackEx();
		System.out.println(ex.message("hello"));
		
		logger.debug("Starting debugging");
		
		logger.error("this is error");
		
		logger.info("Ending debugging");
	}

}
