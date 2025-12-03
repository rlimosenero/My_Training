package test;
import java.util.Scanner;


public class HelloInput {

	public static void main(String[] args) {
		System.out.println("What is your name?");
		Scanner sInput = new Scanner(System.in);
		String name = sInput.nextLine();
		System.out.println("Hello "+name);
		
//changes made
	}

}
