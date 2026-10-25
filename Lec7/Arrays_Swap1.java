package Lec7;

public class Arrays_Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = new int[] { 2, 3, 1, 5, 7 };
		int[] arr = { 2, 3, 1, 5, 7 };
		System.out.println(arr[0] + " " + arr[1]);// 2 3
		swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);// ?
	}

	public static void swap(int a, int b) {
		int t = a;
		a = b;
		b = t;

	}

}
