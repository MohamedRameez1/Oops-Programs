package File1;

import java.util.Scanner;

public class Spy_number {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n,sum=0;
		int product=1;
		//int p;
		System.out.println("Enter the value: ");
		n=s.nextInt();
	while(n>0) {
		n = n%10;
		sum = sum+n;
		product = product*n;
		n =n/10;
	}		
if(sum ==product)
	System.out.println("is a Spy number");
else
	System.out.println("is not a spy number");
s.close();
	}

}
