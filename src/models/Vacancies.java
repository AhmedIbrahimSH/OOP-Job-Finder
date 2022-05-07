package models;

public class Vacancies {
	
	private String JobName;
	private double Salary;
	private String requirements;
	private static int index = 0;
	
	public Vacancies(String jobName, double salary, String requirements) {
		super();
		JobName = jobName;
		Salary = salary;
		this.requirements = requirements;
	}



	public static int getIndex() {
		return index;
	}

	public static void setIndex(int index) {
		Vacancies.index = index;
	}

	public String getJobName() {
		return JobName;
	}
	public void setJobName(String jobName) {
		JobName = jobName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getRequirements() {
		return requirements;
	}
	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

}
