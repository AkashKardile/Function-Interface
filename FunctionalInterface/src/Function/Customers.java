package Function;

public class Customers {
	
	int cId;
	
	String cName;
	
	String city;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customers [cId=" + cId + ", cName=" + cName + ", city=" + city + "]";
	}

	public Customers(int cId, String cName, String city) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.city = city;
	}

	public Customers() {
		super();
	}
	
	

}
