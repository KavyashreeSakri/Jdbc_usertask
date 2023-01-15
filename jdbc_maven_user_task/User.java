package jdbc_maven_user_task;

public class User {
	private int userid;
	private String username;
	private String email;
	private String password;
	private String address;
	private String facebook;
	private String insta;
	private String snap;
	private String whatsap;
	private String twitter;

	public int getUserid() {
		return userid;
	}

	@Override
	public String toString() {
		return "User [facebook=" + facebook + ", insta=" + insta + ", snap=" + snap + ", whatsap=" + whatsap
				+ ", twitter=" + twitter + "]";
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getInsta() {
		return insta;
	}

	public void setInsta(String insta) {
		this.insta = insta;
	}

	public String getSnap() {
		return snap;
	}

	public void setSnap(String snap) {
		this.snap = snap;
	}

	public String getWhatsapp() {
		return whatsap;
	}

	public void setWhatsapp(String whatsap) {
		this.whatsap = whatsap;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
}