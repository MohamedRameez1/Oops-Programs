package File1;

public class Cat extends Animal {
	public void sound() {
		super.sound();    // super keyword is used to call the method of parent class
		System.out.println("Meow");
	}
	public static void main(String[] args) {
		Animal obj = new Cat();
		obj.sound();	

	}

}
