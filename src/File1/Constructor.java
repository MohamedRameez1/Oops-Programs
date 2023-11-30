package File1;

import java.util.Scanner;

public class Constructor {
	int emp_id, salary;
	String emp_name;
	Constructor(){     // \default constructor- no parameters inside the constructor method
		emp_id =1;
		emp_name ="hema";
		salary = 20000;
	}
	Constructor(int id,String name,int sal){  // parameterized constructor
		emp_id = id;
		emp_name = name;
		salary = sal;
	}
	void display() {
			System.out.println("Employee details: ");
			System.out.println("Emp_id: "+emp_id);
			System.out.println("Emp_name: "+emp_name);
			System.out.println("Salary: "+salary);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int id,salary;
		String name;
		System.out.println("employee id: ");
		id = s.nextInt();
		System.out.println("employee name: ");
		name = s.next();
		System.out.println("employee salary: ");
		salary = s.nextInt();
		Constructor obj = new Constructor();
		obj.display();	
		Constructor obj1 = new Constructor(2,"ram",25000);
		obj1.display();
		Constructor obj2 = new Constructor(id,"name",salary);
		obj1.display();
	}

}
