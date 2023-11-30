package File1;

import java.util.Scanner;

public class Accounts {
	static int id;
	static String name;
	static String address;
	static Long contact;
	static int amount;
	
	static void display(int id,String name, String address,long contact,int amount) {
		System.out.println("Account details");
		System.out.println("Account Id: "+id);
		System.out.println("Account name"+name);
		System.out.println("Account address: "+address);
		System.out.println("Account contact: "+contact);
		System.out.println("Account deposit amount: "+amount);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the account id: ");
		id =s.nextInt();
		System.out.println("Enter the account name: ");
		name = s.next();
		System.out.println("Enter the addresses: ");
		address = s.next();
		System.out.println("Enter the contact number: ");
		contact = s.nextLong();
		System.out.println("Enter the deposit amount: ");
		amount = s.nextInt();
		display(id, name, address, contact, amount);
        s.close();
	}

}
