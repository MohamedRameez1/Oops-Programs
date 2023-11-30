package File1;

class person{
	String name;
	int age;
	void getPerInfo(String str,int ag) {
		name=str;
		age=ag;
	}
	
void putperInfo() {
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	}
}
class Student extends person{
	int total;
	char grade;
	void getStuInfo(String n,int ag,int tot,char gr) {
		getPerInfo(n,ag);
		total=tot;
		grade=gr;
	}
	void putStuInfo() {
		putperInfo();
		System.out.println("Total: "+total);
		System.out.println("Grade: "+grade);
		
	}
}
class Single_inheritance {

	public static void main(String[] args) {
		Student s = new Student();
		s.getStuInfo("Honey",22,98,'A');
s.putStuInfo();
	}

}
