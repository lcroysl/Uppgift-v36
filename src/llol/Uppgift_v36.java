package llol;

import java.util.Scanner;

public class Uppgift_v36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("What is your age?");
		String age = input.nextLine();
		System.out.println("What is your address?");
		String address = input.nextLine();
		System.out.println("What is your post code?");
		String post = input.nextLine();
		System.out.println("What city do you live in?");
		String city = input.nextLine();
		System.out.println("What is your number?");
		String number = input.nextLine();

		System.out.println("Information:");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address );
		System.out.println("Post code: " + post);
		System.out.println("City: " + city);
		System.out.println("Phone number: " + number);

	}

}
