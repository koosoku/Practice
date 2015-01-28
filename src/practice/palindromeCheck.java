package practice;
import java.util.Scanner;

public class palindromeCheck {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please input a word or sentence");
		
		String input = in.nextLine();
		String check = "";
		
		for (int i=input.length()-1; i>=0;i--){
			check += input.charAt(i); 
		}
		if (check.equals(input))
			System.out.printf("Yes the word %s is a palindrome", input);
		else
			System.out.printf("No the word %s is not a palindrome",input);
		
	}

}
