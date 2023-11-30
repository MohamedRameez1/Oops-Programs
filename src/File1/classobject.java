package File1;

import java.util.Scanner;

public class classobject {
	static int id;
	static String name;
	static int m1;
	static int m2;
	static int m3;
	//static float total,average;
	
	static void display(int id,String name,int m1,int m2, int m3) {
    float total,average;
	total = m1+m2+m3;
	average = total/3;
	System.out.println("Student details");
	System.out.println("Student Id: "+id);
	System.out.println("Student name"+name);
	System.out.println("Mark1: "+m1);
	System.out.println("Mark2: "+m2);
	System.out.println("Mark3: "+m3);
	System.out.println("Total: "+total);
	System.out.printf("Averge: %.2f",average);
		
}
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the Student id: ");
	id =s.nextInt();
	System.out.print("Enter the Student name: ");
    name =s.next();
    System.out.print("Mark1: ");
    m1 = s.nextInt();
    System.out.print("Mark2: ");
    m2 = s.nextInt();
    System.out.print("Mark3: ");
    m3 = s.nextInt();
    display(id, name, m1, m2, m3);
    s.close();
    
	}

}
