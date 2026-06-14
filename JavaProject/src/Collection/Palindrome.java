package Collection;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Eneter a line..");
		String input = scanner.nextLine();
		
		String rev="";
		
		for (int i= input.length()-1;i>=0;i--)
		{
			rev= rev+input.charAt(i);
		}
		if(input.equalsIgnoreCase(rev))
		{
			System.out.println("Its a palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}

}
