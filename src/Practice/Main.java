package Practice;



public class Main {

    public static void main(String[] args) {
    	int a[] = {1, 2, 3, 4, 5, 6};
    	String[] str = {"racecourse","test"};
        Sort obj= new Sort();
        obj.sortArray();
        System.out.println(obj.primeNumber(a));
        obj.oddorEvenArray(a);
    }
}
