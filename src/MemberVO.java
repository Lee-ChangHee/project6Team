
public class MemberVO {
	private String name;
	private String password;
	private String id;
	private String phoneNumber;
	private sexual sexual;


	public sexual getSexual() {
		return sexual;
	}
	public void setSexual(sexual sexual) {
		this.sexual = sexual;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public MemberVO(String name, String password, String id, String phoneNumber, sexual sexual) {
		this.name = name;
		this.password = password;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.sexual = sexual;
	}

	@Override
	public String toString() {
		return "MemberVO{" +
				"name='" + name + '\'' +
				", password='" + password + '\'' +
				", id='" + id + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				", sexual=" + sexual +
				'}';
	}
}
