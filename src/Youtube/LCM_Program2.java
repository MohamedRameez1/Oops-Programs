package Youtube;

//   Find the least common multiple for the given numbers.
public class LCM_Program2 {

	public static void main(String[] args) {
		int no1 =4;
		int no2 =3;
		int big = no1 > no2? no1:no2;
		
		while(true) {
		if((big%no1 == 0) && (big%no2 == 0))
		{
			System.out.print(big);
			break;
		}
		big++;

	}
	}
}
