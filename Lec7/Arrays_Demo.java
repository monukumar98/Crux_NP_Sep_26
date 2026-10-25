package Lec7;

public class Arrays_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = new int[5];
		int arr[] = new int[5];// C Type
		System.out.println(arr);
		System.out.println(arr.length);
		int[] other = arr;
		// update
		arr[0] = -1;
		arr[1] = 9;
		arr[2] = 3;
		arr[3] = 11;
		arr[4] = 7;
		// print
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

	}

}
