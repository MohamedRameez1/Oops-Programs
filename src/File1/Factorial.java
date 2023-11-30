package File1;

public class Factorial {
	static int factorail(int n) {
		if(n!=0)  // termination condition
			return n*factorail(n-1);
		else 
			return 1;
	}
	

	public static void main(String[] args) {
		int number =4,result;
		result= factorail(number);
		System.out.println(number+"factorial="+result);
		

	}

}
