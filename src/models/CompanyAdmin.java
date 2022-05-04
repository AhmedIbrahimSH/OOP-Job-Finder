package models;

public class CompanyAdmin extends Personal_Info{
	
	private Company CompanyName;
	public CompanyAdmin(String name, String email, String password, String title, Company CompanyName) {
		super(name, email, password, title);
		this.CompanyName = CompanyName;
		// TODO Auto-generated constructor stub
	}

}
