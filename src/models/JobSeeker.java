package models;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class JobSeeker extends Personal_Info {
	
	private String CV;
	private ArrayList <Vacancies> JobList;
	
	public JobSeeker(String name, String email, String password, String title, String CV) {
		super(name, email, password, title);
		this.CV = CV;
	}
	
	
	UserApplications seekerlist = new UserApplications();
	
	public static void showList(ArrayList<Vacancies> list) {
		if(list.size() != 0) {
		int counter2 = 1;
		System.out.println("Your Job Application list is :");
		for(int j = 0 ; j < list.size(); j++) {
			System.out.println();
			System.out.println();
			System.out.println("Application "+ counter2 + " ) ");
			System.out.println("     Company Name : " + list.get(j).getEmployer().GetCompanyName().getName());
			System.out.println("     Job Title : " + list.get(j).getJobName());
			System.out.println("     Job Status : " + UserApplications.getState());
			System.out.println("     Job Reqs : " + list.get(j).getRequirements());
			System.out.println("     Job Salary : " + list.get(j).getSalary());
			counter2++;
			System.out.println();
	}
	}
		if(list.size() == 0)
			System.out.println("You didnot apply for any jobs yet !!");
		
		}
	public static boolean islistempty(ArrayList<Vacancies> list) {
		if(list.size() != 0)
			return false;
		else {
			System.out.println("You donot have any applications !!");
			return true;
		}
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
			if( x.size() == 0) {
				System.out.println("You cannot delete any application because you didnot apply yet !");
			}
			else {
				x.remove(index);
				System.out.println("Deleting your application for the " + x.get(index-1).getJobName() + " posted by " + x.get(index-1).getEmployer().GetCompanyName().getName());

	}}
	public void updateApp(ArrayList<Vacancies> x , int index) throws InterruptedException {
		URL url = null;
		String cv_input;
		boolean isurlValid = false;
		if( x.size() == 0) {
			System.out.println("You cannot update any application because you didnot apply yet !");
		}
		else {
			System.out.println("If you want to update your cv , enter the new link : ");
			Thread.sleep(1000);
			System.out.println("Please upload it as a google drive link so it can be easier for the employer to see it ");
			cv_input = input.nextLine();
			while(!isurlValid) {
		        try {
		            url = new URL(cv_input);
		            isurlValid = true;
		            System.out.println("The url is valid");
					Thread.sleep(1000);
		            System.out.println("CV is successfully uploaded");
		            this.CV = cv_input;
		            System.out.println("Your updated application cv link for the job " + x.get(index).getJobName() + " by the company " + x.get(index).getEmployer().GetCompanyName().getName() + " is : " + this.CV);
		        } catch (MalformedURLException e) {
		            System.out.println("The url is invalid, please try again");
		            cv_input = input.nextLine();
		        }
		    }
		}
		
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
	
	Scanner input = new Scanner(System.in);
	
	}
	

