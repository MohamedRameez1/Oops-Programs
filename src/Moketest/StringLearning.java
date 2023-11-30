package Moketest;

import java.util.Random;

public class StringLearning {
	
	//	       String s = "Rameez";   // RaMeEz
//	
//				public void changetoUppercase() {
//					
//		
//		
//				for(int i =0;i<s.length();i++)
//				{
//					if(i%2 == 0)
//						System.out.print(s.substring(i, i+1).toUpperCase());
//					else
//						System.out.print(s.substring(i, i+1).toLowerCase());
//						
//				}
//			}
	
	
	
				
				public void nonRepeatedCharacter() {
					String s = "Rameez";
						
				
					
					for(int i =0;i<s.length();i++) {
						
												
						char ch = s.charAt(i);
						
						boolean repeat = false;
						
					for(int j = i+1; j<s.length();j++) {
						
						if(ch == s.charAt(j)) 
						{
							repeat = true;
							System.out.println(ch + " repeated");
							break;
							
						}
					}
					
						if(repeat == false)
						{
						//	System.out.println(ch +"non repeated");
							break;
						}
					
						
					}
					
				}
				
				
				
				public void randomQuote() {
					
					String str[] = {"one", "two", "three", "four", "five"};
					
					Random random = new Random();
					
					int R = random.nextInt(str.length);
					System.out.println(str[R]);
					
				}
				
				
				public void stringSort() {
					
					String s[] = {"Doublely", "Circular", " LinkedList"};
					
					
			     
				}
				
				

				
				
	public static void main(String[] args) {
		// changing to Upper Case
		
		
		StringLearning obj = new  StringLearning();
		
//	obj.changetoUppercase();
	obj.nonRepeatedCharacter();
  obj.randomQuote();
	}

}
