package models;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;



public class JobPoster extends Personal_Info {
	private  Company name;
	
	public JobPoster(String name, String email, String password, String title, Company company_name) {
		super(name, email, password, title);
		this.name = company_name;
	}

	public void addJob() {
		
		
	}
	
	public void viewAllApplications(ArrayList<JobSeeker> applicants) {
		
		
		
	}
    public static void ViewApplication(String candidateCv) throws IOException, URISyntaxException{
    	
    	Desktop d = Desktop.getDesktop();
    	d.browse(new URI(candidateCv));
    	
    }
    public void acceptApp() {
    	
    	
    	
    }
    public void rejectApp() {
    	
    	
    } 

}
