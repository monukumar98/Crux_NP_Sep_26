package Lec1;

public class Increment_Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 8;
//		System.out.println(x++);// --> x = x + 1;
//		System.out.println(x);

//		System.out.println(--x);// --> x = x - 1;
//		System.out.println(x);
//		int a = x++ + --x + x-- + --x;
		int a = x++ - ++x - x-- - --x + ++x;
		System.out.println(a);

	}

}
