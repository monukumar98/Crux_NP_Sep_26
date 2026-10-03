package Lec1;

public class Lotter_Game2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=130;
		if(n>=100 &&  n<=200) {
			System.out.println("Bike");
			if(n<=150) {
				System.out.println("Hero");
			}
			else {
				System.out.println("KTM");
			}
		}
		else if(n>=282 && n<=473) {
			System.out.println("MacBook");
			if(n<=350) {
				System.out.println("M1");
			}
			else {
				System.out.println("M2");
			}
			
		}
		else if(n>=53 && n<=93) {
			System.out.println("Cycle");
			if(n<=75) {
				System.out.println("ATLAS");
			}
			else {
				System.out.println("AVON");
			}
			
		}
		else if(n>=789 && n<=898) {
			System.out.println("Kurkure");
			if(n<=800) {
				System.out.println("Red");
			}
			else {
				System.out.println("Green");
			}
			
		}
		else {
			System.out.println("Happy BirthDay!!");
		}
	}

}
