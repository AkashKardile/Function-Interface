package Predicate;

public class Employee {
	int eId;
	
	String eName;
	
	String city;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", city=" + city + "]";
	}

	public Employee(int eId, String eName, String city) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.city = city;
	}

	public Employee() {
		super();
	}
	
	

}
