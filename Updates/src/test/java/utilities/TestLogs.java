package utilities;

import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLogs {

	
	public static Logger log = Logger.getLogger(TestLogs.class.getName());
	// public static Logger log = Logger.getLogger(TestLogs.class);
	
	public static void main(String[] args) {
		
		// Configure time stamp
		// Will create new log files every time you will run the code
		
		Date d = new Date();
		
		// Used this to replace the current format of date as it is not supported
		
		System.setProperty("current.date",d.toString().replace(":", "_").replace(" ", "_"));
		
		
		// We are using propertyconfigurator here bcz we are using a property file for the Appenders
		// We are not using the log.xml file here for the appenders
		
		PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");
		log.info("This is the info log");
		log.error("This is the error log");
		log.debug("This is the debug log");
	

	}

}
