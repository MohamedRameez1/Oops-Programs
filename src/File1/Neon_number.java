package File1;

import java.util.Scanner;

public class Neon_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,p,sum=0;
		int square=0;
		n = s.nextInt();
		while(n>0) {
			square = n*n;
			p = %10;
		sum = p+sum;
            n = n/10;
		}
            if(n==sum)
            System.out.println("is a neon number");
            else
            	System.out.println("is not a neon number");
            s.close();
	}

}
