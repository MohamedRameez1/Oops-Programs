package File1;
class Student1{
	int rollno;
	String name;
	float fee;
	Student1(int rollno,String nam,float fee){
		this.rollno=rollno;   // if class variable and parameter variable is same we should use (this.)
		this.name=name;
		this.fee=fee;
	}
	void display() {
	System.out.println(rollno+" "+name+" "+fee);
}
}

public class TestThis1 {

	public static void main(String[] args) {
		Student1 s1= new Student1(111,"anikit",5000f);
		Student1 s2= new Student1(112,"anikit",6000f);
		s1.display();
		s2.display();

	}

}
