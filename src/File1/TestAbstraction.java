package File1;

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("drawing rectangle");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("drawing circle");
	}
}

public class TestAbstraction {

	public static void main(String[] args) {
		Shape s=new Circle();
		Shape r = new Rectangle();
s.draw();
r.draw();
	}

}
