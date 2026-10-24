package Lec6;

public class Function_Demo3 {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		int a = 7;
		int b = 8;
		System.out.println(val);// 100
		System.out.println(add(a, b));
		System.out.println(val);// ??
		System.out.println("Bye");
	}

	public static int add(int a, int b) {
		int val = 70;
		Function_Demo3.val = Function_Demo3.val - 5;
		int c = a + b;
		return c + sub(c, a);
	}

	public static int sub(int a, int b) {

		int c = a - b;
		return c;
	}
}
