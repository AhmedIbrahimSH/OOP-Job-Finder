package models;

import java.util.*;



public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		ArrayList <CompanyAdmin> CompanyAdmins;
		boolean jobposter = false , companyadmin = false , jobseeker = false; 
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
				System.out.println("Are you a company admin ? Enter Yes or No");
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
						companyadmin = true;
				else
						jobposter = true;
						
				}
				
			
			else if(answer.toLowerCase().equals("no")) {
				jobseeker = true;
			}
		
			System.out.println("Do you have an account ?   Answer with yes or no ");
			String having_an_account = input.nextLine();
			if((errorchecker(having_an_account) == false)) {
				System.out.println("ERROR !");
				System.out.println("Please Enter as mentioned above \"YES\" if you are an employer , otherwise \"NO\"");
				while((errorchecker(having_an_account) == false)) {
					having_an_account = input.nextLine();
					errorcheck(having_an_account);
				}
			}
			
			// case 1.0 : if the user have an account , we ask him for the details like username and password 
			else if(having_an_account.toLowerCase().equals("yes")) {
				System.out.println("Please Enter your username :  ");
				String username = input.nextLine();
				System.out.println();
				System.out.println("Please Enter your Password :  ");
				String password = input.nextLine();

			}
			else {
				System.out.println("We will help you register for a new account , so please complete the following questions ");
				Thread.sleep(1500);
				System.out.println("Please Enter your name :  ");
				String new_name = input.nextLine();
				Thread.sleep(1000);
				System.out.println("Please Enter a username for your account :  ");
				String new_username = input.nextLine();
				Thread.sleep(1000);
				System.out.println("Please Enter a password for your account");
				System.out.println("WARNING : Make sure your password contains at least 8 characters");
				System.out.println("Enter your password here: ");
				String new_password = input.nextLine();
				System.out.println("LOADING REGISTRATION PLEASE WAIT !");
				Thread.sleep(1500);
				System.out.println("Registered Successfully !!");
				System.out.println();
				
				
			}
			
			
			
			
			// defining the functionalities that a user may do if he is a company admin
			if(companyadmin = true) {
				
			}
		
		
		
		
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
	
}
