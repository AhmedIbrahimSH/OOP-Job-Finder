package models;

import java.util.ArrayList;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
public class JobApplication {
	
	private ArrayList<JobSeeker> job_seeker;
	private String Application_State;
	
	
	public JobApplication(ArrayList <JobSeeker> job_seeker, String application_State) {
		this.job_seeker = job_seeker;
		Application_State = application_State;
	}


	public String getAppState() {
		
		
		return null;
		
		
	}

	
	


}
	
	
//	public static void sendMail(String Receipent) {
//		Properties properties = new Properties();
//		properties.put("mail.smtp.auth", "true");
//		properties.put("mail.smtp.starttls.enable", "true");
//		properties.put("mail.smtp.host", "smtp.gmail.com");
//		properties.put("mail.smtp.port", "587");
//		
//		String email = "xxxxxxxx@gmail.com";
//		String Password = "xxxxxxxxxx";
//		
//		Session session = Session.getInstance(properties, new Authenticator() {
//			@override 
//			protected PasswordAuthentication getPasswordAuthentication() {
//				return new PasswordAuthentication(email, Password);
//				
//			}
//		});
//		Message message = prepareMessage(Session session, email);
//
//	}
//}
