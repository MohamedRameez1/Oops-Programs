package File1;
class parents
{
	void show()
	{
		System.out.println("we are parents");
	}
}
class son1 extends parents
{
	void disp()
	{
		System.out.println(" i am son class");
	}
}
class daughter extends parents
{
	void disp()
	{
		System.out.println("i am daughter class");
	}
}

public class Hierarchial_Inheritance {

	public static void main(String[] args) {
		son1 s = new son1();
		daughter d = new daughter();
		s.show();
		d.show();
		s.disp();
		d.disp();
		

	}

}
