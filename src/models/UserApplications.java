package models;

import java.util.ArrayList;

public class UserApplications {
	
		private static String state = "In review";
		private ArrayList <String> AppliedForJobs = new ArrayList <String>();
		private ArrayList <Company> appliedfor = new ArrayList <Company> ();
		private JobPoster sentTo;
//		private Company company = new Company();
//		private String JobName;
		
		public UserApplications(String JobName , Company CompanyName) {
				AppliedForJobs.add(JobName);
				appliedfor.add(CompanyName);		
		}
		public UserApplications() {

		}

		public static String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public ArrayList<String> getAppliedForJobs() {
			return AppliedForJobs;
		}
		public void setAppliedForJobs(ArrayList<String> appliedForJobs) {
			AppliedForJobs = appliedForJobs;
		}
		
	
}
