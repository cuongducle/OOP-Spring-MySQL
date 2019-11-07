package list_class;

public class Location extends Entity {
	
	
	
	
	public Location(String id, String label, String description) {
		super(id, label, description);
		
	}
	private String nation;
	
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	
}
