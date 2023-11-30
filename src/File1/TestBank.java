package File1;

abstract class Bank1{
	abstract int getRateOfinterest();
}
class SBI extends Bank1{
	int getRateOfinterset() {
		return 7;
	}
}
class PNB extends Bank1{
	int getRateOfinterset() {
		return 8;
	}

class TestBank1 {

	public static void main(String[] args) {
		Bank1 b;
		b = new SBI();
		System.out.println("Rate of interest is:"+b.getRateOfinterest()+"%");
		b = new PNB();
		System.out.println("Rate of interest is:"+b.getRateOfinterest()+"%");
	}

}
}
