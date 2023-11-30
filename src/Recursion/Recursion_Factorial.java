package Recursion;

public class Recursion_Factorial {

	public static void main(String[] args) {
		
		
		int findFact (int n){
			n = 4;
			
			
	       	if(n == 1)
				return 1;
			else 
				return n * findFact(n-1);
			
			
		}
	}
}
	
