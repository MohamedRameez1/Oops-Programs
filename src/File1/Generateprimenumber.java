package File1;

import java.util.Scanner;

public class Generateprimenumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,number=2;
		System.out.println("Enter the number: ");
		n =s.nextInt();
		for(int i=1;i<=n;i++) {
			if(number==2) {
				System.out.println(2+" ");
				number++;
			}
			else {
				Task:
					for(int j =2;j<=number/2;j++) {
						if(number%j==0) {
							number++;
							continue Task;
						}
					}
				System.out.print(number++ +" ");
			}
		
	}
	}
}
