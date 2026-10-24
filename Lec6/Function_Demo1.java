package Lec6;

public class Function_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		add();
		System.out.println("Bye");

	}

	public static void add() {
		int a = 9;
		int b = 7;
		int c = a + b;
		sub();
		System.out.println(c);
	}

	public static void sub() {
		int a = 9;
		int b = 7;
		int c = a - b;
		System.out.println(c);
	}

}
