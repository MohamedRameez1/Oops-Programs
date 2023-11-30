package File1;
class ClassFirst{
	public void display() {
		System.out.println("class First: display");
	}
	public void show() {
		System.out.println("class First: show");
	}
}
class Classsecond extends ClassFirst{
	public void display() {
		System.out.println("class First: display");
	}
	// cannot override with different access specifier
	//protected void show(){}
	public void show() {
		System.out.println("class First: show");
	}
}

public class UseFirstSecound {

	public static void main(String[] args) {
		Classsecond cs  = new Classsecond();
		cs.display();
		cs.show();

	}

}
