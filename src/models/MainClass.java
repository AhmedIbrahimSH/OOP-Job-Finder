package models;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;


public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		String new_name = null ,new_company_name = null,new_user_title = null,new_email = null,new_password= null, cv_input = null;
		URL url = null;
		Company first_company = null, second_company = null; 
		String email = null;
		ArrayList <CompanyAdmin> CompanyAdmins = new ArrayList<CompanyAdmin>() ;
		ArrayList <JobSeeker> JobSeekers = new ArrayList<JobSeeker>();
		ArrayList <JobSeeker> New_Seekers = new ArrayList<JobSeeker>();
		ArrayList <JobPoster> JobPosters_of_firstcompany = new ArrayList<JobPoster>() ;
		ArrayList <JobPoster> JobPosters_of_secondcompany = new ArrayList<JobPoster>() ;
		ArrayList <JobPoster> max_company_jobposters,Adidas_company_jobposters;
		ArrayList <Vacancies> Available_Jobs;
		String req1 = "Computer Science Graduate , min age : 20 , excellent english";
		Vacancies JobAtFirstCompany = new Vacancies("Software Developer", 1500, req1);
		String req2 = "Business Student , min age : 18 , good english";
		Vacancies Job2AtFirstCompany = new Vacancies("Business Analyst", 1600, req2);
		String req3 = "Doctor , min age : 25 , excellent english";
		Vacancies Job3AtFirstCompany = new Vacancies("Doctor ", 1800, req3);
		
		String req4 = "Computer Science Graduate , min age : 20 , excellent english";
		Vacancies Job1AtSecondCompany = new Vacancies("Computer Science", 2000, req4);
		String req5 = "Journalist , min age : 30 , excellent english";
		Vacancies Job2AtSecondCompany = new Vacancies("Journalist", 150, req5);
		String req6 = "Mechanical Engineer , min age : 20 , excellent english";
		Vacancies Job3AtSecondCompany = new Vacancies("Mechanical Engineer", 1500, req6);
		
		
		ArrayList <Vacancies> AllJobs = new ArrayList <Vacancies>(Arrays.asList(JobAtFirstCompany, Job2AtFirstCompany, Job3AtFirstCompany,Job1AtSecondCompany, Job2AtSecondCompany, Job3AtSecondCompany));
		ArrayList <Vacancies> JobsAtFirstCompany = new ArrayList <Vacancies>(Arrays.asList(JobAtFirstCompany, Job2AtFirstCompany, Job3AtFirstCompany));
		ArrayList <Vacancies> JobsAtSecondCompany = new ArrayList <Vacancies>(Arrays.asList(Job1AtSecondCompany, Job2AtSecondCompany, Job3AtSecondCompany));

		
		
		// pre-defined companies 
		
		ArrayList <String> reviews_of_first_company = new ArrayList <String>(Arrays.asList("Excellent", "Very Good", "Good", "Good","Very Good"));
						
		ArrayList <String> reviews_of_second_company = new ArrayList <String>(Arrays.asList("Good", "Very Good", "Good", "Good","Very Good", "Bad"));
		
		
		// pre-defined jobposters
		
		JobPoster maged = new JobPoster("maged", "maged@gmail.com", "012345678", "HR", first_company);
		JobPoster mariam = new JobPoster("mariam", "mariam@gmail.com", "12345678", "PR", first_company);
		JobPoster ali = new JobPoster("ali", "ali@gmail.com", "456789123", "Software manager",first_company);
		JobPoster ahmed = new JobPoster("ahmed", "ahmed@gmail.com", "012378945", "HR",first_company);
		JobPoster wael = new JobPoster("wael", "wael@gmail.com", "10234568", "Software Developer",second_company);
		JobPoster hazem = new JobPoster("hazem", "hazem@gmail.com", "12354881", "PR",second_company);
		JobPoster mohamed = new JobPoster("mohamed","mohamed@gmail.com", "2548864551", "Manager", second_company);
		JobPoster yusuf = new JobPoster("yusuf", "yusuf@gmail.com", "354864846", "HR", second_company);
		
		max_company_jobposters = new ArrayList <JobPoster>(Arrays.asList(maged, mariam , ali, ahmed));
		Adidas_company_jobposters = new ArrayList <JobPoster>(Arrays.asList(wael, hazem , mohamed, yusuf));
		
		first_company = new Company("Max" , 10 ,100, reviews_of_first_company, JobsAtFirstCompany, max_company_jobposters);
		second_company  = new Company("Adidas", 15,100, reviews_of_second_company, JobsAtSecondCompany, Adidas_company_jobposters);

		
		
		// pre-defined company admins
		
		CompanyAdmin omar = new CompanyAdmin("ahmed", "ahmed@gmail.com", "01244846", "General Manager ", first_company);
		CompanyAdmin sami = new CompanyAdmin("ali","ali@gmail.com", "123456789", "Head of HR", first_company);
		CompanyAdmin hassan = new CompanyAdmin("hassan","hassan@gmail.com" , "015155561351", "Head of HR", second_company);
		CompanyAdmin malak = new CompanyAdmin("malak", "malak@gmail.com" ,"0123789456", "General Manager", second_company);
		CompanyAdmins.add(omar);
		CompanyAdmins.add(sami);
		CompanyAdmins.add(hassan);
		CompanyAdmins.add(malak);

		
		// pre-defined job seekers already exists in the system
		JobSeeker tarek = new JobSeeker("tarek","tarek@gmail.com","123456789","software developer ","cv1.pdf"); 
		JobSeeker mahmoud = new JobSeeker("mahmoud","mahmoud@gmail.com","0123456789","software developer","cv.pdf"); 

		JobSeekers.add(tarek);
		JobSeekers.add(mahmoud);

		// start of command line program
		boolean isjobposter = false , iscompanyadmin = false , isjobseeker = false,isurlValid = false;  // boolean values which determine the job of the user
		System.out.println("HELLO !");
		System.out.println();
		System.out.println("With this application we will help you find the best jobs available");
		Thread.sleep(2000);
		System.out.println();
		System.out.println("We are going to ask you some questions to make your experience easier");
		Thread.sleep(1000);
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.println("Are you an employer ?  Answer Yes or No ");
		String answer = input.nextLine();
		while((errorcheck(answer) == false)) {
				answer = input.nextLine();
			}
		
		  // if the user enters yes or no as answer , we specify his exact reason to enter whether to add a job / search for a job / add a company
		
		if(answer.toLowerCase().equals("yes")) {
				System.out.println("Please State whether you are a Job Poster or a Company Admin");
				Thread.sleep(1000);
				System.out.println("Are you a company admin ? Enter \"Yes\" or \"No\"");
				String Job = input.nextLine();
					while((errorcheck(Job) == false)) {
						Job = input.nextLine();
					}
				
				
				if(Job.toLowerCase().equals("yes"))
						iscompanyadmin = true;
				else
						isjobposter = true;
						
				}
				
			
			else if(answer.toLowerCase().equals("no")) {
				isjobseeker = true;
			}
		
		
		
		
			/*
			 Case 1
			 
			 asking for account login/register
			 the following part is to ask the user if he have an account so he login or to register 
				
			*/
			
		/* case 1.0 : asking the user if he has an account or no , entering yes if he has , else no
			if the user enters anything else an error message will pop up asking him to enter yes or no 
		*/
			System.out.println("Do you have an account ?   Answer with \"yes\" or \"no\" ");
			String having_an_account = input.nextLine();
				while((errorcheck(having_an_account) == false)) {
					having_an_account = input.nextLine();
				}
			
			
			// case 1.1 : if the user have an account , we ask him for the details like username and password 
			 if(having_an_account.toLowerCase().equals("yes")) {
				System.out.println("Please Enter your email :  ");
				 email = input.nextLine();
				System.out.println();
				System.out.println("Please Enter your Password :  ");
				String password = input.nextLine();
				if(isjobseeker == true) {
				while(account_authinticator_JobSeeker(email,password, JobSeekers) == false) {
					System.out.println("Please Enter your email :  ");
					email = input.nextLine();
					System.out.println();
					System.out.println("Please Enter your Password :  ");
					password = input.nextLine();
				}
				System.out.println();
					
				}
				
				// if the user is job poster and his functions
				else if(isjobposter == true) {
					System.out.println("Please Enter the company name you work for :  ");
					System.out.println();
					
//					while(account_authinticator_JobPoster(email,password,JobPosters ) == false) {
//						System.out.println("Please Enter your email :  ");
//						email = input.nextLine();
//						System.out.println();
//						System.out.println("Please Enter your Password :  ");
//						password = input.nextLine();
//					}
					System.out.println();
					System.out.println("");
					
					
					
					
				// authenticate admin account 
					}
				else if(iscompanyadmin == true) {
					while(account_authinticator_Admin(email,password, CompanyAdmins) == false) {
						System.out.println("Please Enter your email :  ");
						email = input.nextLine();
						System.out.println();
						System.out.println("Please Enter your Password :  ");
						password = input.nextLine();
					}
					System.out.println();
						
					}
			// case  : if the user doesnot have an account , we ask him for the details like username and password to register 

			}
			else {
				System.out.println("We will help you register for a new account , so please complete the following questions ");
				Thread.sleep(1500);
				System.out.println("Please Enter your name :  ");
				new_name = input.nextLine();
				Thread.sleep(1000);
				System.out.println("Please Enter your email :  ");
				new_email = input.nextLine();
				Thread.sleep(1000);
				System.out.println("Please Enter your JobTitle :  ");
				new_user_title = input.nextLine();
				Thread.sleep(1000);
				System.out.println("Please Enter the name of the organization you work for  :  ");
				System.out.println();
				System.out.println("Enter the word \"employee\" if you are an employee looking for a job");
				
				// change here to company
				new_company_name = input.nextLine();
				Thread.sleep(1000);
				
				
				System.out.println("Please Enter a password for your account");
				System.out.println("WARNING : Make sure your password contains at least 8 characters");
				System.out.println("Enter your password here: ");
				new_password = input.nextLine();
				while((lengthofpasswordchecker(new_password) == false)) {
					new_password = input.nextLine();
				}
				System.out.println("LOADING REGISTRATION PLEASE WAIT !");
				Thread.sleep(1500);
				System.out.println("Registered Successfully !!");
				System.out.println();
			}
			Thread.sleep(2000);
			
			
			
			
			if(new_company_name != null) {
			if(new_company_name.toLowerCase().equals("employee")) {
					System.out.println("Please upload your cv " );
					Thread.sleep(1000);
					System.out.println("Please upload it as a google drive link so it can be easier for the employer to see it ");
					cv_input = input.nextLine();
					while(!isurlValid) {
				        try {
				            url = new URL(cv_input);
				            isurlValid = true;
				            System.out.println("The url was valid");
							Thread.sleep(1000);
				            System.out.println("CV successfully uploaded");
				        } catch (MalformedURLException e) {
				            System.out.println("The url was invalid, please try again");
				            cv_input = input.nextLine();
				        }
				    }
					
					// creating new object of jobseeker and ensuring the details
					
					JobSeeker new_job_seeker = new JobSeeker(new_name,new_email, new_password, new_user_title, cv_input.toString());
					JobSeekers.add(new_job_seeker);
					System.out.println();
					System.out.println("Your Account details is : ");
					System.out.println();
					System.out.println("Name : " + new_name);
					System.out.println();
					System.out.println("Email : " + new_email );
					System.out.println();
					System.out.println("Password : " + new_password);
					System.out.println();
					System.out.println("Job Title : " + new_user_title);
					System.out.println();
					System.out.println("Your CV link : " + cv_input.toString());
					System.out.println();

			}}
			
			
			
			// if user is job seeker
			
			if(isjobseeker == true) {		
				System.out.println("Do you want to Apply and view Jobs ? ");
				System.out.println();
				System.out.println("Enter \"Yes\" or \"No\" ");
				String lookingforajob = input.nextLine();
				while(errorcheck(lookingforajob) == false) {
					lookingforajob = input.nextLine();
				}
				if(lookingforajob.toLowerCase().equals("yes")) {
					JobSeeker new_applicant = null;
					System.out.println("Please Select the index of the job you want ");
					Thread.sleep(2000);
					System.out.println();
					int a = 1;
					System.out.println();
					System.out.println("Available Jobs : ");
					Thread.sleep(2000);
					String apply = "no";
					while(apply.toLowerCase().equals("no")) {
						a = 1;
						for(int i = 0 ; i < (AllJobs.size()) ; i++){
							System.out.println();
							System.out.println(a + ")  " + "Job Title : " + AllJobs.get(i).getJobName());
							System.out.println("    Essential Requierments : " + AllJobs.get(i).getRequirements());
							System.out.println("    Salary : " + AllJobs.get(i).getSalary() + " $");
							a++;
							System.out.println();
							Thread.sleep(2000);

						}
						System.out.println("The wanted index :  ");
						int x = input.nextInt();
						System.out.println("Did you want to apply for  " + AllJobs.get(x-1).getJobName()+ " ? ");
						System.out.println();
						System.out.println("Answer with \"YES\" or \"No\"");
						apply = input.nextLine();
						while(errorcheck(apply) == false) {
							apply = input.nextLine();
						}
					}
					
					if(apply.toLowerCase().equals("yes")) {
						System.out.println("You application has been received successfully ");
						System.out.println();
						System.out.println("We will contact you within 2 weeks if we see that your cv applied with our requierments");
						for(int i = 0 ; i < JobSeekers.size()	; i++) {
							if(email == JobSeekers.get(i).getEmail()) {
								new_applicant = JobSeekers.get(i);
								New_Seekers.add(new_applicant);
								break;
							}
						}
						
						System.out.println();
						System.out.println("Your Acount Details are : ");
						System.out.println();
						if(new_applicant != null) {
						System.out.println("Your Name  is : " + new_applicant.getName());
						System.out.println("Your Email is : " + new_applicant.getEmail());
						System.out.println("Your Title is : " + new_applicant.getTitle());
						System.out.println("Your CV link  : " + new_applicant.getCv());
						
						System.out.println("Thank you for your application and We wish to see you soon");
						}
						
						
					}
				}
			
			
			}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/* 1) to ensure that the input is either yes or no , whatever it is , capital or lower case 
	   2) if the input is not yes or no , an error message appears requiring the user to enter yes or no as answer
	
	*/
	public static boolean errorcheck(String answer) {
		if((answer.toLowerCase().equals("yes") == false) && (answer.toLowerCase().equals("no") == false)){
			System.out.println("ERROR !");
			System.out.println("Please Enter as mentioned above with \"YES\" or \"NO\"");
			return false;
		}
		else 
			return true;
	
	}
	
	// to ensure that password is longer than 8
	public static boolean lengthofpasswordchecker(String password) {
		if(password.length() < 8) {
			System.out.println("ERROR !");
			System.out.println("Please Enter a password that consists of more than 8 characters ");
			return false;
		}
		else 
			return true;
		
	}
	
	public static boolean account_authinticator_JobSeeker(String email , String Password, ArrayList<JobSeeker> list) throws InterruptedException {
		
		int found = 0 , not_found = 0 , correct = 0, wrong = 0, index = 0;
		for(int i = 0 ; i < list.size(); i++) {
			if(list.get(i).getEmail().equals(email)) {
				index = i;
				found = 1;
				if(list.get(i).getPassword().equals(Password)) {
					correct = 1;
				}
				else {
					wrong = 1;
				}
			}
			else 
				not_found = 1;
		}
		System.out.println();
		if(found == 1 && correct == 1) {
			System.out.println("Signed In Successfully");
			System.out.println();
			System.out.println("Welcome " + list.get(index).getName());
			return true;
		}
		else if(found == 1 && wrong == 1) {
			System.out.println();
			System.out.println("Wrong Password");
			Thread.sleep(1500);
			System.out.println("Try Again");
			return false;
		}
		else {
			System.out.println("Account not found");
			System.out.println();
			return false;
		}
	}

public static boolean account_authinticator_JobPoster(String email , String Password, ArrayList<JobPoster> list) throws InterruptedException {
	
	int found = 0 , not_found = 0 , correct = 0, wrong = 0, index = 0;
	for(int i = 0 ; i < list.size(); i++) {
		if(list.get(i).getEmail().equals(email)) {
			index = i;
			found = 1;
			if(list.get(i).getPassword().equals(Password)) {
				correct = 1;
			}
			else {
				wrong = 1;
			}
		}
		else 
			not_found = 1;
	}
	System.out.println();
	if(found == 1 && correct == 1) {
		System.out.println("Signed In Successfully");
		System.out.println();
		System.out.println("Welcome Mr. " + list.get(index).getName());
		System.out.println();
		System.out.println("Job Title : " + list.get(index).getTitle());
		return true;
	}
	else if(found == 1 && wrong == 1) {
		System.out.println();
		System.out.println("Wrong Password");
		Thread.sleep(1500);
		System.out.println("Try Again");
		return false;
	}
	else {
		System.out.println("Account not found");
		System.out.println();
		return false;
	}
}

public static boolean account_authinticator_Admin(String email , String Password, ArrayList<CompanyAdmin> list) throws InterruptedException {
	
	int found = 0 , not_found = 0 , correct = 0, wrong = 0, index = 0;
	for(int i = 0 ; i < list.size(); i++) {
		if(list.get(i).getEmail().equals(email)) {
			index = i;
			found = 1;
			if(list.get(i).getPassword().equals(Password)) {
				correct = 1;
			}
			else {
				wrong = 1;
			}
		}
		else 
			not_found = 1;
	}
	System.out.println();
	if(found == 1 && correct == 1) {
		System.out.println("Signed In Successfully");
		System.out.println();
		System.out.println("Welcome Mr. " + list.get(index).getName());
		System.out.println();
		System.out.println("Job Title : " + list.get(index).getTitle());
		return true;
	}
	else if(found == 1 && wrong == 1) {
		System.out.println();
		System.out.println("Wrong Password");
		Thread.sleep(1500);
		System.out.println("Try Again");
		return false;
	}
	else {
		System.out.println("Account not found");
		System.out.println();
		return false;
	}
}
	
}
