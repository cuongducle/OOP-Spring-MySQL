package list_class;

public class Entity {
	private String id;
	private String label;
	private String description;
	
	
	public Entity(String id, String label, String description) {
	
		this.id = id;
		this.label = label;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
