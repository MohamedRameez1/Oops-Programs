package File1;

import java.util.Scanner;

public class Prime_member2 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the minimum value: ");
		int min =s.nextInt();
		System.out.println("Enter the maximum value: ");
		int max =s.nextInt();
		System.out.print("prime members are: ");
		for(int i=min;n<=max;n++)
		    int count=0;
			for(int i=2;i<=n/2;i++) {
			if(n%i==0)
			{
				count++;
				//System.out.println(n+"is not a prime number");
			break;
		}
		}
		
         if(count ==0 && n!=0)
         {
        	 System.out.println(n+" ");
         }
        	 
	}

}
