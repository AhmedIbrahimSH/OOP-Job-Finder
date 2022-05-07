package models;

public class JobSeeker extends Personal_Info {
	
	private String CV;
	public JobSeeker(String name, String email, String password, String title, String CV) {
		super(name, email, password, title);
		this.CV = CV;
	}
	public void applyJob() {
		
		
		
	}
	public String addReview() {
		return CV;
		
		
	}  
	public void deleteApp() {
		
	}
	public void browseApp() {
		
	}
	public void updateApp() {
		
	}
	public String getCv() {
		return CV;
	}
	public void setCv(String CV) {
		this.CV = CV;
	}
	
}
