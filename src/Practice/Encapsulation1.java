package Practice;

 class Encaspse{
	 private String studentName;
	 private int studentroll;
	 private String studentBD;
 
 
 public String getstudentName() {
	 return studentName;

 }
 public int getstudentroll() {
	 return studentroll;
 }
 public String getstudentBD() {
	 return studentBD;
 }
 public void setstudentName(String value) {
	 studentName = value;
	 
 }
	 
 }

public class Encapsulation1 {

	public static void main(String[] args) {
		Encaspse obj = new Encaspse();
		obj.setstudentName("ram11");
		System.out.println(obj.getstudentName());
		
	}

}
