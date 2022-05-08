package models;

public class JobSeeker extends Personal_Info {
	
	private String CV;
	public JobSeeker(String name, String email, String password, String title, String CV) {
		super(name, email, password, title);
		this.CV = CV;
	}
	public void applyJob() {
		
		
		
	}
	public static boolean reviewchecker(String x) {
		if(x.toLowerCase().equals("excellent") == false && x.toLowerCase().equals("very good") == false && x.toLowerCase().equals("good") == false && x.toLowerCase().equals("bad") == false)
		{
			System.out.println("Enter a relevant review word which are : Excellent , very good , good , bad ");
			return false;
		}
		
		else
			return true;
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
