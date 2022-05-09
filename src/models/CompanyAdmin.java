package models;

public class CompanyAdmin extends Personal_Info{
	private Company CompanyName; 
	
	public CompanyAdmin(String name, String email, String password, String title, Company Name) {
		super(name,email,password,title);
		CompanyName = Name;
		// TODO Auto-generated constructor stub
	}

	public Company getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(Company companyName) {
		CompanyName = companyName;
	}
	

}
