package list_class;

public class Organization extends Entity {
	
	
	
	
	public Organization(String id, String label, String description) {
		super(id, label, description);
		
	}
	private String location;
	private String headquarter;
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHeadquarter() {
		return headquarter;
	}
	public void setHeadquarter(String headquarter) {
		this.headquarter = headquarter;
	}
	
	
}
