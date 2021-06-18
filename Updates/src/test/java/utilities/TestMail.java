package utilities;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class TestMail {

	public static void main(String[] args) throws AddressException, MessagingException {


		MonitoringMail mail = new MonitoringMail();
		
		// No need to write this over here 
		// Instead create a separate file to store all this
		// Create static variables - you can call directly using "Classname.variableName"
		// Check TestConfig file
		
		//mail.sendMail("smtp.gmail.com", "gurpreetk8382@gmail.com", "", subject, messageBody);
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
		
	}

}
