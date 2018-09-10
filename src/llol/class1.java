package llol;

import java.util.Scanner;

public class class1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double x = input.nextdouble();
		double y = inout.nextdouble();
		
		if (x > 0 && y > 0){
			System.out.println(1);
		}
		if (x > 0 && y < 0){
			System.out.println(4);
		}
		if (x < 0 && y > 0){
			System.out.println(2);
		}
		if (x < 0 && y < 0){
			System.out.println(3);
		}
	}

}
