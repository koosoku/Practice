package practice;

import java.util.Arrays;
import java.util.Scanner;

public class stringReverse {
	public static void main (String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string.");
		String input = in.nextLine();
		
		char[] outputArray= new char[input.length()];
		int temp = input.length();
		
		for (int i=0;i<input.length();i++){
			outputArray[--temp]= input.charAt(i);
		}
		for (int i =0; i<input.length();i++){
			System.out.print(outputArray[i]);
		}

	}
}
