package models;

public class Company {
	 private String name;
	 private int No_Job_vacancies;
	 private String reviews ;
	 private int No_of_employees ;
	 private JobPoster JobPosters[] ;
	private Company(String name, int No_Job_vacancies, String reviews, int No_of_employees, JobPoster[] JobPosters) {
		this.name = name;
		this.No_Job_vacancies = No_Job_vacancies;
		this.reviews = reviews;
		this.No_of_employees = No_of_employees;
		this.JobPosters = JobPosters;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo_Job_vacancies() {
		return No_Job_vacancies;
	}
	public void setNo_Job_vacancies(int no_Job_vacancies) {
		No_Job_vacancies = no_Job_vacancies;
	}
	public String getReviews() {
		return reviews;
	}
	public void setReviews(String reviews) {
		this.reviews = reviews;
	}
	public int getNo_of_employees() {
		return No_of_employees;
	}
	public void setNo_of_employees(int no_of_employees) {
		No_of_employees = no_of_employees;
	}
	public JobPoster[] getJobPoster() {
		return JobPoster;
	}
	public void setJobPoster(JobPoster[] jobPoster) {
		JobPoster = jobPoster;
	}
	 
	 
}
