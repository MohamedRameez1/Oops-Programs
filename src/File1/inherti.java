package File1;
class Simple{
	private int pri;
	int def;
	protected int pro;
	public int pub;
	
	Simple(){
		pri=10;
		def=20;
		pro=30;
		pub=40;
	}
}

public class inherti extends Simple {
	inherit(){
		// pri =100;
		def = 200;
		pro =300;
		pub =400;
		
	}

	public static void main(String[] args) {
		inherit i = new inherit();
		
		//can;t access private
		System.out.println(i.pri);
		System.out.println(i.def);
		System.out.println(i.pro);
		System.out.println(i.pub);
		

	}

}
