package File1;
abstract class Bank5{
	abstract int getrateOfInterest();
}

class SBI extends Bank5{
	int getrateOfInterest() {
		return 7;
	}
}
class PNB extends Bank5{
	int getrateOfInterest() {
		return 8;
	}
}
 class TestBank5 {

	public static void main(String[] args) {
		Bank5 b;
		b=new SBI();
		System.out.println("rate of interst is" + b.getrateOfInterest()+"%");
		b=new PNB();
		System.out.println("rate of interst is" + b.getrateOfInterest()+"%");

	}

 }
