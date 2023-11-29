package Streams;

public class Employee {
	int eId;
	
	String eName;
	
	String designation;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", designation=" + designation + "]";
	}

	public Employee(int eId, String eName, String designation) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.designation = designation;
	}

	public Employee() {
		super();
	}
	
	

}
