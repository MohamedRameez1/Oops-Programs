package Youtube;

   // Find the common divisor of two given numbers.
   // Find the greatest common divisor of two given numbers.

public class Comman_Divisor_Program1 {

	public static void main(String[] args) {
		int no1 = 100;
		int no2 = 120;
		int div = 2;
		int gcd =0;
		int small = no1 < no2? no1:no2;   // Ternary operator 
		
		while(div<small)
		{
		
		if((no1%div == 0)&&(no2%div == 0))
		
			//System.out.println(div);
		    gcd = div;                    // to Find greatest common divisor
		 div++;
	
	}
		System.out.println("The greated common divisor: "+gcd);
	}

}
