package Recursion;


public class Fibonacci_series {

	public static void main(String[] args) {
		
		int f =0;	
		int s = 1;
		int i =1;
		int count =5;
		while(i < count)
		{
			System.out.print(f+" ");

			System.out.print(s+" ");
			f = f+s;
			s = f+s;
			i += 3;
			
			if(i == count)
				System.out.print(f+" ");
		
		}

	}

}
