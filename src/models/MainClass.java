package models;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;


public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		String new_name = null ,new_company_name = null,new_user_title = null,new_email = null,new_password= null, cv_input = null;
		URL url = null;
		ArrayList <CompanyAdmin> CompanyAdmins = new ArrayList<CompanyAdmin>() ;
		ArrayList <JobSeeker> JobSeekers = new ArrayList<JobSeeker>();
		ArrayList <JobPoster> JobPosters = new ArrayList<JobPoster>() ;

		// pre defined job seekers already exists in the system
		JobSeeker ahmed = new JobSeeker("Ahmed Ibrahim","ahmed@gmail.com","123456789","software developer ","cv1.pdf"); 
		JobSeeker hazem = new JobSeeker("Hazem Zaki","hazem@gmail.com","0123456789","software developer","cv.pdf"); 

		JobSeekers.add(ahmed);
		JobSeekers.add(hazem);

		
		boolean isjobposter = false , iscompanyadmin = false , isjobseeker = false,isurlValid = false; 
		System.out.println("HELLO !");
		System.out.println();
		Thread.sleep(2000);
		System.out.println("We are going to ask you some questions to make your experience easier");
		Thread.sleep(1000);
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.println("Are you an employer ?  Answer Yes or No ");
		String answer = input.nextLine();
		if((errorchecker(answer) == false)) {
			System.out.println("ERROR !");
			System.out.println("Please Enter as mentioned above \"YES\" if you are an employer , otherwise \"NO\"");
			while((errorchecker(answer) == false)) {
				answer = input.nextLine();
				errorcheck(answer);
			}
		}
		  // if the user enters yes or no as answer , we specify his exact reason to enter whether to add a job / search for a job / add a company
		
		if(answer.toLowerCase().equals("yes")) {
				System.out.println("Please State whether you are a Job Poster or a Company Admin");
				Thread.sleep(1000);
				System.out.println("Are you a company admin ? Enter \"Yes\" or \"No\"");
				String Job = input.nextLine();
				if((errorchecker(Job) == false)) {
					System.out.println("ERROR !");
					System.out.println("Please Enter as mentioned above \"YES\" if you are an employer , otherwise \"NO\"");
					while((errorchecker(Job) == false)) {
						Job = input.nextLine();
						errorcheck(Job);
					}
				}
				
				else if(Job.toLowerCase().equals("yes"))
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
			if((errorchecker(having_an_account) == false)) {
				System.out.println("ERROR !");
				System.out.println("Please Enter as mentioned above \"YES\" if you are an employer , otherwise \"NO\"");
				while((errorchecker(having_an_account) == false)) {
					having_an_account = input.nextLine();
					errorcheck(having_an_account);
				}
			}
			
			// case 1.1 : if the user have an account , we ask him for the details like username and password 
			else if(having_an_account.toLowerCase().equals("yes")) {
				System.out.println("Please Enter your email :  ");
				String email = input.nextLine();
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
				else if(isjobposter == true) {
					while(account_authinticator_JobPoster(email,password,JobPosters ) == false) {
						System.out.println("Please Enter your email :  ");
						email = input.nextLine();
						System.out.println();
						System.out.println("Please Enter your Password :  ");
						password = input.nextLine();
					}
					System.out.println();
						
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
			// case 1.2 : if the user doesnot have an account , we ask him for the details like username and password to register 

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
			
			
			
			// defining the functionalities that a user may do if he is a company admin
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
	}
	
	// to avoid printing  error twice
	private static boolean errorchecker(String answer) { 
		if((answer.toLowerCase().equals("yes") == false) && (answer.toLowerCase().equals("no") == false))
			return false;
		else 
			return true;
	}
	
	/* 1) to ensure that the input is either yes or no , whatever it is , capital or lower case 
	   2) if the input is not yes or no , an error message appears requiring the user to enter yes or no as answer
	
	*/
	public static boolean errorcheck(String answer) {
		if((answer.toLowerCase().equals("yes") == false) && (answer.toLowerCase().equals("no") == false)){
			System.out.println("ERROR !");
			System.out.println("Please Enter as mentioned above \"YES\" if you are an employer , otherwise \"NO\"");
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
