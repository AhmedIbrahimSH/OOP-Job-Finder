package models;

import java.util.ArrayList;

public class Company {
	 private String name;
	 private int No_Job_vacancies;
	 private int No_of_employees ;
	 private ArrayList<String> reviews ;
	 private ArrayList <Vacancies> Vacancies;
	 private ArrayList<JobPoster> JobPosters ;
	 

	public Company(String name, int no_Job_vacancies, int No_of_employees, ArrayList<String> reviews_of_first_company,ArrayList<models.Vacancies> jobsAtFirstCompany, ArrayList<JobPoster> jobPosters) {
		this.name = name;
		No_Job_vacancies = no_Job_vacancies;
		this.No_of_employees = No_of_employees;
		this.reviews =reviews_of_first_company;
		Vacancies = jobsAtFirstCompany;
		JobPosters = jobPosters;
	}
		// TODO Auto-generated constructor stub
	

	
	public ArrayList<Vacancies> getVacancies() {
			return Vacancies;
		}
	public void setVacancies(ArrayList<Vacancies> vacancies) {
			Vacancies = vacancies;
		}
	public ArrayList<String> getReviews() {
		return reviews;
	}
	public void setReviews(ArrayList<String> reviews) {
		this.reviews = reviews;
	}
	public String getName() {
		return name;
	}
	public ArrayList<JobPoster> getJobPoster() {
		return JobPosters;
	}
	public void setJobPoster(ArrayList<JobPoster> jobPoster) {
		JobPosters = jobPoster;
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
	
	public int getNo_of_employees() {
		return No_of_employees;
	}
	public void setNo_of_employees(int no_of_employees) {
		No_of_employees = no_of_employees;
	}
	
	 
}
