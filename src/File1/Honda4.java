package File1;

abstract class Bike{         // abstract class
	abstract void run();    // abstract method. which used to declare method
	void display() {        // normal method which is called as non abstract method.
		System.out.println("non-abstract-method");
		
	}
}

class Honda4 extends Bike {
	void run() {
		System.out.println("Runnung safely");
	}

	public static void main(String[] args) {
		Bike obj = new Honda4();
   obj.display();
   obj.run();
	}

}
