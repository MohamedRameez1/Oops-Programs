package File1;
class Employee{
	int salary =40000;
}
public class Programmer extends Employee {
	int bonus = 10000;
	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("Salary: "+p.salary);
		System.out.println("Bonus: "+p.bonus);

	}

}
