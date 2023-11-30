package File1;
interface MyInterface
{
	public void method1();
	public void method2();
}
class Demo1 implements MyInterface
{
	public void method1()
	{
		System.out.println("implementatation of method1");
	}
	public void method2()
	{
		System.out.println("implementatation of method2");
	}
	
	public static void main(String[] args) {
	    MyInterface obj = new Demo1();
	    obj.method1();
	}

}
