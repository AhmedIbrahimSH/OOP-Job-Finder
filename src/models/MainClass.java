package models;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;


public class MainClass {

	public static void main(String[] args) throws InterruptedException, IOException, URISyntaxException {
		String new_name = null ,new_company_name = null,new_user_title = null,new_email = null,new_password= null, cv_input = null;
		URL url = null;
		Company first_company = new Company("Max"), second_company = new Company("Adidas") , third_company = new Company("Siemens");
		String email = new String();
		
		ArrayList <CompanyAdmin> CompanyAdmins = new ArrayList<CompanyAdmin>() ;
		
		ArrayList <JobSeeker> JobSeekers = new ArrayList<JobSeeker>();
		ArrayList <JobSeeker> New_Seekers = new ArrayList<JobSeeker>();
		ArrayList <JobSeeker> New_Seekers2 = new ArrayList<JobSeeker>();
		ArrayList <JobSeeker> New_Seekers3 = new ArrayList<JobSeeker>();

//	ArrayList <JobPoster> JobPosters_of_firstcompany = new ArrayList<JobPoster>() ;
	//	ArrayList <JobPoster> JobPosters_of_secondcompany = new ArrayList<JobPoster>() ;
	//	ArrayList <JobPoster> JobPosters_of_third_company = new ArrayList<JobPoster>() ;
		ArrayList <JobPoster> max_company_jobposters,Adidas_company_jobposters,Siemens_company_jobposters;
		
		ArrayList <UserApplications> userapplicationlist = new ArrayList<UserApplications>();
		
		
//		ArrayList <Vacancies> Available_Jobs;
		ArrayList <Vacancies> AppliedFor = new ArrayList<Vacancies>();
//		ArrayList <Vacancies> pendingJobs = new ArrayList<Vacancies>();

		// pre-defined jobposters

		JobPoster maged = new JobPoster("Maged", "maged@gmail.com", "012345678", "HR", first_company);
		JobPoster mariam = new JobPoster("Mariam", "mariam@gmail.com", "12345678", "PR", first_company);
		JobPoster ali = new JobPoster("Ali", "ali@gmail.com", "456789123", "Software manager",first_company);
		JobPoster ahmed = new JobPoster("Ahmed", "ahmed@gmail.com", "012378945", "HR",first_company);
		JobPoster wael = new JobPoster("Wael", "wael@gmail.com", "10234568", "Software Developer",second_company);
		JobPoster hazem = new JobPoster("Hazem", "hazem@gmail.com", "12354881", "PR",second_company);
		JobPoster mohamed = new JobPoster("Mohamed","mohamed@gmail.com", "2548864551", "Manager", second_company);
		JobPoster yusuf = new JobPoster("Yusuf", "yusuf@gmail.com", "354864846", "HR", second_company);
		JobPoster hassan = new JobPoster("Hassan", "hassan@gmail.com", "354864846", "HR", third_company);
		JobPoster hamada= new JobPoster("Hamada", "hamada@gmail.com", "354864846", "HR", third_company);
		JobPoster mahmoud = new JobPoster("Mahmoud", "mahmoud@gmail.com", "354864846", "HR", third_company);
		JobPoster mark = new JobPoster("Mark", "mark@gmail.com", "354864846", "HR", third_company);

		String req1 = "Computer Science Graduate , min age : 20 , excellent english";
		Vacancies JobAtFirstCompany = new Vacancies("Software Developer", 1500, req1 , maged);
		String req2 = "Business Student , min age : 18 , good english";
		Vacancies Job2AtFirstCompany = new Vacancies("Business Analyst", 1600, req2,mariam);
		String req3 = "Doctor , min age : 25 , excellent english";
		Vacancies Job3AtFirstCompany = new Vacancies("Doctor ", 1800, req3, ali);
		String req4 = "Computer Science Graduate , min age : 20 , excellent english";
		Vacancies Job1AtSecondCompany = new Vacancies("Computer Science", 2000, req4, mohamed);
		String req5 = "Journalist , min age : 30 , excellent english";
		Vacancies Job2AtSecondCompany = new Vacancies("Journalist", 150, req5,yusuf);
		String req6 = "Mechanical Engineer , min age : 20 , good english";
		Vacancies Job3AtSecondCompany = new Vacancies("Mechanical Engineer", 1500, req6,hazem);
		String req7 = "Doctor Bachaleors , min age : 26 , advanced english";
		Vacancies Job1AtThirdCompany = new Vacancies("Doctor Bachaleors", 800, req1 , hamada);
		String req8 = "Electronics Engineer , min age : 19 , excellent english";
		Vacancies Job2AtThirdCompany = new Vacancies("Electronics Engineer", 1500, req1 , mahmoud);
		String req9 = "Teacher of French , min age : 28 , excellent english and good french";
		Vacancies Job3AtThirdCompany = new Vacancies("Teacher of French", 2500 , req1 , mark);
		
		ArrayList <Vacancies> AllJobs = new ArrayList <Vacancies>(Arrays.asList(JobAtFirstCompany, Job2AtFirstCompany, Job3AtFirstCompany,Job1AtSecondCompany, Job2AtSecondCompany, Job3AtSecondCompany,Job1AtThirdCompany,Job2AtThirdCompany,Job3AtThirdCompany));
		ArrayList <Vacancies> JobsAtFirstCompany = new ArrayList <Vacancies>(Arrays.asList(JobAtFirstCompany, Job2AtFirstCompany, Job3AtFirstCompany));
		ArrayList <Vacancies> JobsAtSecondCompany = new ArrayList <Vacancies>(Arrays.asList(Job1AtSecondCompany, Job2AtSecondCompany, Job3AtSecondCompany));
		ArrayList <Vacancies> JobsAtThirdCompany = new ArrayList <Vacancies>(Arrays.asList(Job1AtThirdCompany, Job2AtThirdCompany, Job3AtThirdCompany));

		
		
		// pre-defined reviews 
		
		ArrayList <String> reviews_of_first_company = new ArrayList <String>(Arrays.asList("Given by Ahmed : Excellent", "Given by Ali : Very Good", "Given by Mohamed : Good", "Given by Salma : Good","Given by Ahmed : Very Good"));
						
		ArrayList <String> reviews_of_second_company = new ArrayList <String>(Arrays.asList("Given by Hassan : Good", "Given by Omar : Very Good", "Given by Ali : Good", "Given by Hazem : Good","Given by Mariam : Very Good", "Given by Abdelrahman : Bad"));
		
		ArrayList <String> reviews_of_third_company = new ArrayList <String>(Arrays.asList("Given by Mark : Very Good", "Given by Hazem : Very Good", "Given by Ali : Good", "Given by Ahmed : Bad ","Given by Omar : Very Good", "Given by Abdelrahman : Excellent "));

		
		
		
		max_company_jobposters = new ArrayList <JobPoster>(Arrays.asList(maged, mariam , ali, ahmed));
		Adidas_company_jobposters = new ArrayList <JobPoster>(Arrays.asList(wael, hazem , mohamed, yusuf));
		Siemens_company_jobposters = new ArrayList <JobPoster>(Arrays.asList(hassan , hamada , mark , mahmoud ));
		
		first_company = new Company("Max" , 1910 ,10 ,100, reviews_of_first_company, JobsAtFirstCompany, max_company_jobposters);
		second_company  = new Company("Adidas", 1925 ,15,100, reviews_of_second_company, JobsAtSecondCompany, Adidas_company_jobposters);
		third_company  = new Company("Siemens", 1905 ,15,100, reviews_of_third_company, JobsAtThirdCompany, Siemens_company_jobposters);

		ArrayList <Company> all_companies = new ArrayList <Company>(Arrays.asList(first_company,second_company,third_company ));
		
		
		// pre-defined company admins
		
		CompanyAdmin omar = new CompanyAdmin("Omar", "omar@gmail.com", "01244846", "General Manager ", first_company);
		CompanyAdmin sami = new CompanyAdmin("Sami","sami@gmail.com", "123456789", "Head of HR", first_company);
		CompanyAdmin Hakim = new CompanyAdmin("Hakim","Hakim@gmail.com" , "015155561351", "Head of HR", second_company);
		CompanyAdmin malak = new CompanyAdmin("Malak", "malak@gmail.com" ,"0123789456", "General Manager", second_company);
		CompanyAdmin Karim = new CompanyAdmin("Karim", "Karim@gmail.com" ,"3546846161", "HR MANAGER", third_company);
		CompanyAdmin Sayed = new CompanyAdmin("Sayed", "Sayed@gmail.com" ,"468468646", "CHIEF MANAGER", third_company);

		CompanyAdmins.add(omar);
		CompanyAdmins.add(sami);
		CompanyAdmins.add(Hakim);
		CompanyAdmins.add(malak);
		CompanyAdmins.add(Karim);
		CompanyAdmins.add(Sayed);

		
		// pre-defined job seekers already exists in the system
		
		JobSeeker tarek = new JobSeeker("Tarek","tarek@gmail.com","123456789","software developer ","https://www.resumonk.com/resume-templates"); 
		JobSeeker anas = new JobSeeker("Anas","anas@gmail.com","0123456789","Doctor","https://resume-example.com/"); 
		JobSeeker hossam = new JobSeeker("Hossam","hossam@gmail.com","0123456789","Mechanical Engineer","https://resume-example.com/"); 
		JobSeeker hassanin = new JobSeeker("Hassanin","hassanin@gmail.com","0123456789","Marketing analyst","https://www.resumonk.com/resume-templates"); 
		JobSeeker hamdy = new JobSeeker("Hamdy","hamdy@gmail.com","0123456789","Teacher","https://resume-example.com/"); 

		
		JobSeekers.add(tarek);
		JobSeekers.add(anas);
		JobSeekers.add(hossam);
		JobSeekers.add(hassanin);
		JobSeekers.add(hamdy);

		
		
		
		boolean isjobposter = false , iscompanyadmin = false , isjobseeker = false,isurlValid = false;  // boolean values which determine the job of the user
		
		
		// start of the command line 
		
		// introducing with the user 
		
		System.out.println("Welcome Back !");
		System.out.println();		
		System.out.println("With this application we will help you find the best jobs available");
		Thread.sleep(2000);
		System.out.println();
		System.out.println("We are going to ask you some questions to make your experience easier");
		Thread.sleep(1000);
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.println("Are you an employer ?  Answer \"Yes\" or \"No\"  (Enter No if you are looking for a job)");
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
				            System.out.println("The url is valid");
							Thread.sleep(1000);
				            System.out.println("CV is successfully uploaded");
				        } catch (MalformedURLException e) {
				            System.out.println("The url is invalid, please try again");
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
			
			
			
			// if user is job seeker   code below from line 305 to 
			
			if(isjobseeker == true) {		
				System.out.println("Do you want to Apply and view Jobs ? ");
				System.out.println();
				System.out.println("Enter \"Yes\" or \"No\" ");
				String lookingforajob = input.nextLine();
				while(errorcheck(lookingforajob) == false) {
					lookingforajob = input.nextLine();
				}
				if(lookingforajob.toLowerCase().equals("yes")) {
									
					System.out.println();
					Thread.sleep(2000);
					int a = 1, d = 0 , x = 0 ; // to control showing the application 309-327
					char c = 65;
					System.out.println("Available Jobs : ");
					Thread.sleep(2000);
					a = 1;
					c= 65 ;
					for(int i = 0 ; i < (all_companies.size()) ; i++){
						System.out.println();
						d = 0;
						Thread.sleep(1500);
			//			System.out.println( c + ") "+ "Offered by \"" + all_companies.get(i).getName() + "\" Company : ");
						System.out.println();
//						Thread.sleep(1500);
						for(int j = 0 ; j < (all_companies.get(i).getVacancies().size()); j++) {
//								System.out.println(a + " ) " + "Posted by : " + all_companies.get(i).getVacancies().get(d).getEmployer().getName());
								System.out.println( a + " ) " + "Offered by \"" + all_companies.get(i).getName() + "\" Company : ");
								System.out.println("    Job Title : " + all_companies.get(i).getVacancies().get(j).getJobName());
								System.out.println("    Essential Requierments : " + all_companies.get(i).getVacancies().get(j).getRequirements());
								System.out.println("    Salary : " + all_companies.get(i).getVacancies().get(j).getSalary() + " $");
								a++;
								System.out.println();
								Thread.sleep(1000);
								d++;
						}
						c++;
					}
					System.out.println("How many jobs do you want to apply for ?   Enter 0 if you don't wont to apply ");
					System.out.println();
					System.out.println();
					System.out.println("Note : Maximum number of jobs that you can apply for is 5 ");
					int applyingfor = input.nextInt();
					
// exception handling if the user enters a letter for phase 2 implementation					
//					while(!input.hasNextInt()) {
//						System.out.println("Please Enter valid integar number ");
//						applyingfor = input.nextInt();
//					}
					if(applyingfor != 0) {
						while(applyingfor < 0 || applyingfor > 5) {
							System.out.println("Invalid Number \nPlease enter number between 1 and 5");
							System.out.println();
							applyingfor = input.nextInt();
						}
						int[] numberofjobs = new int[applyingfor];
						System.out.println("Enter the indices of the jobs you want please in seperate lines");
						System.out.println();
						System.out.println("Enter 0 if you don't want to apply for further jobs ");
						for(int z = 0; z < applyingfor;z++) {
							int memo = input.nextInt(); // storing the number in a variable to ensure that it is valid
							while(memo > AllJobs.size() ) {
								System.out.println("Invalid Index entered");
								System.out.println("Please enter a valid index between 1 and " + AllJobs.size());
								memo = input.nextInt();
								
							}
							if(memo == 0) {
								break;
							}
							numberofjobs[z] = memo;
						}
						
						for(int i = 0 ; i < applyingfor; i++) {
							x = numberofjobs[i]; // stores number of the choosen index in the for loop to make it easy
							if(x == 0)
								break ; 
							System.out.println();
							System.out.println( (i+1) + " ) "+ "Completing your application for the \"" + AllJobs.get(x-1).getJobName()+ "\" job" + " posted by \"" + AllJobs.get(x-1).getEmployer().GetCompanyName().getName()+"\" Company");
							Thread.sleep(1500);
							// newly added
							UserApplications new_applicant = new UserApplications(AllJobs.get(x-1).getJobName(),AllJobs.get(x-1).getEmployer().GetCompanyName()) ;
							userapplicationlist.add(new_applicant);
							//
							System.out.println();
							int x2 = x - 1; // to store x (the index of the chosen job)
								AppliedFor.add(AllJobs.get(x2)) ;
								Thread.sleep(2000);
								System.out.println("You application has been received successfully ");
								System.out.println();
								Thread.sleep(2000);
								System.out.println("We will contact you within 2 weeks if we see that your cv applied with our requierments");
								Thread.sleep(1000);
								System.out.println("Thank you for your application and We wish to see you soon");
								System.out.println();
								System.out.println();
					
							}}}
						
						
						Thread.sleep(1200);
						String view;
						System.out.println("Do you want to review your applications ?");
						view = input.nextLine();
						if(lookingforajob.toLowerCase().equals("yes")) {
							view = input.nextLine();
						}
						while(!errorcheck(view)) {
							view = input.nextLine();
						}
						
						if(view.toLowerCase().equals("yes")) {
							int counter = 1;
							JobSeeker.showList(AppliedFor);


						}						
						

						Thread.sleep(1200);
						String update;
						System.out.println("Do you want to Update or to delete one of your applications ?");
						update = input.nextLine();
						while(errorcheck(update) == false) {
							update = input.nextLine();
						}
						if(update.toLowerCase().equals("yes")) {
							
							System.out.println("Enter the letter 'U' to update and letter 'D' to delete");
							System.out.println("Enter the letter \"s\" if you don't want to continue this process ");
							String change = input.next();
							while(!change.toLowerCase().equals("u") && !change.toLowerCase().equals("d") && !change.toLowerCase().equals("s")) {
								System.out.println("Error\nEnter a valid letter please\n'U' to update and letter 'D' to delete ");
								change = input.nextLine();
							}
							if(!change.toLowerCase().equals("s")) {
							if(change.toLowerCase().equals("d")) {
								System.out.println();
						//		System.out.println("Your Job List is : ");
								JobSeeker.showList(AppliedFor);

								System.out.println();
								if(!JobSeeker.islistempty(AppliedFor)) {
								System.out.println("How many applications do you want to delete (Enter 0 if you want none to be deleted) ");
								int number = input.nextInt();
								if(number > AppliedFor.size() || number < 0) {
									System.out.println("Error!\nPlease enter valid number of Application between 0 and " + AppliedFor.size());
									number = input.nextInt();
								}
								
								for(int i = 0 ; i < number ; i++) {
								System.out.println("Enter the index of the application you want to delete from the list shown above");
								int deletedindex = input.nextInt();
								
					//			System.out.println("Note that the size is : " + AppliedFor.size());
								
								if(deletedindex != 0) {
								while(deletedindex < 0 || deletedindex > AppliedFor.size()) {
									System.out.println("Invalid Index");
									System.out.println("Please enter a valid index");
									deletedindex = input.nextInt();
								}
								
								// look here
								
								JobSeeker.deleteApp(AppliedFor, deletedindex);
								
								
								
								Thread.sleep(1000);
			//					System.out.println("Deleting your application !!");
								Thread.sleep(2000);
								System.out.println("Deleted Successfully ");
								System.out.println();
								System.out.println("Your new updated Application list is : ");
								System.out.println();
//								System.out.println("Your Job Application list is :");
								JobSeeker.showList(AppliedFor);
								}}}
								}						
							if(change.toLowerCase().equals("u")) {
								if(!JobSeeker.islistempty(AppliedFor)) {
									System.out.println("How many applications do you want to update (Enter 0 if you want none to be updated) ");
									int number = input.nextInt();
							
									if(number > AppliedFor.size() || number < 0) {
										System.out.println("Error!\nPlease enter valid number of Application between 0 and " + AppliedFor.size());
										number = input.nextInt();
									}
									
									for(int i = 0 ; i < number ; i++) {
									System.out.println("Enter the index of the application you want to update from the list shown above   (If you don't want to proceed updating enter 0)");
									int updatedindex = input.nextInt();
									
							//		System.out.println("Note that the size is : " + AppliedFor.size());
									
									if(updatedindex != 0) {
										while(updatedindex < 0 || updatedindex > AppliedFor.size()) {
											System.out.println("Invalid Index");
											System.out.println("Please enter a valid index");
											updatedindex = input.nextInt();
										}
										tarek.updateApp(AppliedFor, updatedindex);
									}
									else {
										continue;
									}
								
								
							}
									
								}

							
						}}}
					
						
					

					System.out.println();
					
					// TO ADD OR SEE REVIEWS IF YOU ARE JOBSEEKER
					
					System.out.println("Do you want to see the Companies info and the reviews of the companies ? ");
					String result = input.nextLine();
					while(errorcheck(result) == false) {
						result = input.nextLine();
					}
					if(result.toLowerCase().equals("yes")) {
						
						Thread.sleep(2000);
						System.out.println();
						Thread.sleep(1500);
						int a = 1 ; 
						for(int i = 0 ; i < all_companies.size(); i++) {
							System.out.println(a + " ) " + "Company Name : " + all_companies.get(i).getName() );
							System.out.println();
							System.out.println("Company Published by : " + all_companies.get(i).getPublishDate());
							System.out.println();
							System.out.println("Number of Employees in the Company is : " + all_companies.get(i).getNo_of_employees());
							System.out.println();
							System.out.println("The reviews for the Company known as  \"" + all_companies.get(i).getName() + "\"  is : ");
							System.out.println();
							System.out.println("Note That the best review is excellent while bad is the worst");
							System.out.println();
							System.out.println();
							for(int j = 0 ; j < all_companies.get(i).getReviews().size(); j++) {
								System.out.println((j+1) + " ) " + all_companies.get(i).getReviews().get(j)+"  ");
							}
							System.out.println();
							System.out.println();
							a++;
						}
					}
					
					System.out.println();
					System.out.println("Do you want to add a review ? ");
					String result2 = input.nextLine();
					while(errorcheck(result2) == false) {
						result2 = input.nextLine();
					}
					if(result2.toLowerCase().equals("yes")) {
						System.out.println("Please Enter the name of the company that you want to rate ");
						Thread.sleep(1000);
						System.out.println("We will show you the names of the companies ");
						System.out.println();
						int b = 1 , found = 0; // found is a variable to ensure that the company exist
						for(int i = 0 ; i < all_companies.size(); i++) {
							System.out.println(b + " ) " + all_companies.get(i).getName());
							System.out.println();
							b++;
						}
						
						System.out.println("If you changed your mind and don't want to review enter the word \"skip\" ");
						String nameofcompany = input.nextLine();
						if(!nameofcompany.toLowerCase().equals("skip")) {
							while(!JobSeeker.companyfound(nameofcompany, all_companies)) {
								System.out.println("Company not found please enter a valid company name");
								nameofcompany = input.nextLine();
							}
							System.out.println();
							System.out.println("Enter your review please ");
							String reviewing = input.nextLine();
							while(JobSeeker.reviewchecker(reviewing) == false) {
								reviewing = input.nextLine();
									}
							JobSeeker.review(nameofcompany, reviewing, all_companies);
						}
			
			
					}}
			System.out.println();
			System.out.println("Thank you for using the application and hope to see you soon ");
			
	
	}
					
			
			
			
			
			
			// end of job seeker functions 
	
	
	
	
	
	
	
	
	// end of main function 
	
	
	
	// the following code is the methods body mentioned above 
	
	
	
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
			System.out.println("Welcome Mr. " + list.get(index).getName());
			System.out.println("Your Job Title is :  " + list.get(index).getTitle());
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
		System.out.println("Job Title :" + list.get(index).getTitle());
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
