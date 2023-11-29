package Streams;

public class College {
	int cid;
	
	String cname;
	
	String city;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public College(int cid, String cname, String city) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.city = city;
	}

	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + ", city=" + city + "]";
	}

	public College() {
		super();
	}
	
	

}
