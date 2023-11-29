package Streams;

public class School {
	int sId;
	
	String sName;
	
	String city;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "School [sId=" + sId + ", sName=" + sName + ", city=" + city + "]";
	}

	public School(int sId, String sName, String city) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.city = city;
	}

	public School() {
		super();
	}
	
	

}
