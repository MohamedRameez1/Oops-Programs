package File1;

import java.util.Scanner;

public class SimpleRecursion {

	public static void main(String[] args) {
				Scanner s=new Scanner (System.in);
				long n=s.nextLong();
				callMyself(n);
				
			}
			//The recursive java method
			
			public static void callMyself(long i) {
				if(i <= 0) {
					return;
				}
				System.out.print(i+" ");
				i = i - 1;
				callMyself(i);
			}

	}


