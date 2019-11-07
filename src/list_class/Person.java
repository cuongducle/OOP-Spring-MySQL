package list_class;

import java.util.Date;

public class Person extends Entity {
	
	
	
	
	public Person(String id, String label, String description) {
		super(id, label, description);
	}
	private String job;
	private String nationality;
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
}
