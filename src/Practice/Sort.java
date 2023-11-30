package Practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Sort {



		    public void sortArray() {
		        Scanner s = new Scanner(System.in);
		        int n = s.nextInt();
		        int arr[] = new int[n];
		        int k = 0;
		        for (int i = 0; i < n; i++)
		            arr[i] = s.nextInt();

		        System.out.println("Before Swapping: ");

		        for (int i = 0; i < n; i++) {
		            System.out.print(arr[i] + " ");
		        }

		        for (int j = 1; j < n; j++) {

		            for (int i = 0; i < n - j; i++) {

		                if (arr[i] > arr[i + 1]) {

		                    int t = arr[i];
		                    arr[i] = arr[i + 1];
		                    arr[i + 1] = t;

		                }
		                k++;
		            }

		        }
		        System.out.println("\nAfter swapping: ");

		        for (int i = 0; i < n; i++)
		            System.out.print(arr[i] + " ");
		        System.out.println("\nLength: " + k);

		        s.close();
		    }
		    
		    
		    public LinkedList<Integer> primeNumber(int[] a) {
				
				
				
				int k=0;
				LinkedList<Integer> res = new LinkedList<Integer>();
				
				for(int i=0;i<a.length;i++) {
					int count =0;
					for(int j=1;j<=a[i];j++)
					{
						if(a[i]%j == 0)
							count++;
						
						k++;
					}
					if(count == 2) {
//			System.out.print(a[i]+",");
						res.add(a[i]);
					}
					
					
				}
				System.out.println("Length: "+k);

				return res;
				
			}
		    
		    public void oddorEvenArray(int[] a) {

		    
		    		int a1[] = {1, 2, 3, 4, 5, 6};
		    		int n =a1.length;
		    		int odd[]= new int[n];
		    		int even[]= new int[n];
		    		
		    		int e = 0;
		    		
		    	    int o = 0;
					for(int i=0;i<n;i++)
		    	    {
		    	    	
						if(a1[i]%2== 0)
		    	    		even[e++]=a1[i];
		    	    	else
		    	    		odd[o++]=a1[i];
		    	    }
					
		    	    System.out.print("odd: ");
		    	    
		    	    
		    	    for(int i=0;i<o;i++)
		    	    {
		    	    	if(i==o-1)
		    	    		System.out.print(odd[i]);
		    	    	else
		    	    		System.out.print(odd[i]+",");
		    	    }
		    	    
		    	    System.out.print("\neven: ");
		    	    for(int i=0;i<e;i++)
		    	    {
		    	    	if(i==e-1)
		    	    		System.out.println(even[i]);
		    	    	else
		    	    		System.out.print(even[i]+",");
		    	    		
		    	    		}
		    }
		    
			public static boolean stringsPalindrome(String[] array) {
			    int length = array.length;

			    for (int i = 0; i < length / 2; i++) {
			        String str1 = array[i].replaceAll("\\s", "").toLowerCase();
			        String str2 = array[length - 1 - i].replaceAll("\\s", "").toLowerCase();

			        if (!str1.equals(str2)) {
			            return false; 
			        }
			    }

			    return true; 
			}
    }
 
   
 


	     
