package File1;
class person{
	private String name;
	private int age;
	private String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	public String getcountry() {
		return country;
	}
	public void setage(String country) {
		this.country = country;
	}
}

public class getset {

	public static void main(String[] args) {
		person  p = new person();
		p.setName("ram");
		p.setcountry("India");
		p.setage(24);
		

	}

}
