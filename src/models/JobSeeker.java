package models;

import java.util.ArrayList;

public class JobSeeker extends Personal_Info {
	
	private String CV;
	private ArrayList <Vacancies> JobList;
	public JobSeeker(String name, String email, String password, String title, String CV) {
		super(name, email, password, title);
		this.CV = CV;
	}
	public static void showList(ArrayList<Vacancies> list) {
		if(list != null) {
		int counter2 = 1;
		for(int j = 0 ; j < list.size(); j++) {
			System.out.println();
			System.out.println();
			System.out.println("Application "+ counter2 + " ) ");
			System.out.println("     Company Name : " + list.get(j).getEmployer().GetCompanyName().getName());
			System.out.println("     Job Title : " + list.get(j).getJobName());
			System.out.println("     Job Reqs : " + list.get(j).getRequirements());
			System.out.println("     Job Salary : " + list.get(j).getSalary());
			counter2++;
			System.out.println();
	}
	}
		else
			System.out.println("You didnot apply for any jobs yet !!");
		
		}
	public static boolean islistempty(ArrayList<Vacancies> list) {
		if(list != null)
			return false;
		else
			return true;
			
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
	public static void deleteApp(ArrayList<Vacancies> x , int index) {
				x.remove(index);
				System.out.println("Deleting your application for the " + x.get(index+1).getJobName() + " posted by " + x.get(index+1).getEmployer().GetCompanyName().getName());

	}
	public void browseApp() {
		
	}
	
	public void updateyourapp(String new_CV) throws InterruptedException {
		this.CV = new_CV;
		System.out.println("Updating your CV");
		Thread.sleep(1500);
		System.out.println("Your CV has been Successfully updated !! ");
	}
	public String getCv() {
		return CV;
	}
	public void setCv(String CV) {
		this.CV = CV;
	}
	public static void review(String nameofcompany , String review , ArrayList <Company> companies) {
		for(int i = 0 ; i < companies.size(); i++) {
			if(nameofcompany.equals(companies.get(i).getName())) {
				System.out.println("Enter your review ");
				companies.get(i).getReviews().add(review);
				System.out.println("Your review has been succefully added");
				System.out.println("Thank you for your contribution ");
			}}}
	public static boolean companyfound(String name , ArrayList <Company> list ) {
		for(int i = 0 ; i < list.size(); i++) {
			if(name.equals(list.get(i).getName())) 
				return true;
			}
		return false;
		}
	
	
	}
	

