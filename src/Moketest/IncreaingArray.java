package Moketest;

import java.util.Scanner;

public class IncreaingArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int arr[]= new int[n];
		
		for(int i =0 ;i<n;i++)
			arr[i] = s.nextInt();
		
	     boolean isAscending = true;
		
	    for (int i = 0; i < n - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                isAscending = false;
                break;
            }
        }

        if (isAscending == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}