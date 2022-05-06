package models;

import java.util.*;



public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("HELLO !");
		System.out.println();
		Thread.sleep(2000);
		System.out.println("We are going to ask you some questions to make your experience easier");
		Thread.sleep(1000);
		System.out.println();
		Scanner input = new Scanner(System.in);
		System.out.println("Are you an employer ?  Answer Yes or No ");
		String answer = input.nextLine();
		if((errorcheck(answer) == false)) {
			while((errorcheck(answer) == false)) {
				answer = input.nextLine();
				errorcheck(answer);
			}
		}
		else 
		{
			if(answer.toLowerCase().equals("yes")) {
				System.out.println("");
			}
		}
			
		
		


		
	}
	public static boolean errorcheck(String answer) {
		if((answer.toLowerCase().equals("yes") == false) && (answer.toLowerCase().equals("no") == false)){
			System.out.println("ERROR !");
			System.out.println("Please Enter as mentioned above \"YES\" if you are an employer , otherwise \"NO\"");
			return false;
		}
		else 
			return true;
	
	}
	
	public static boolean AccountCheck(String answer) {
		if((answer.toLowerCase().equals("yes") == false) && (answer.toLowerCase().equals("no") == false)){
			System.out.println("");
			System.out.println("Please Enter as mentioned above \"YES\" if you are an employer , otherwise \"NO\"");
			return false;
		}
		else 
			return true;
	
		}

}
