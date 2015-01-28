package practice;
import java.util.Scanner;

public class countVowels {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		int vowelCount=0;
		
		for(int i = 0;i<input.length();i++){
			if( input.charAt(i)=='a'||
				input.charAt(i)=='e'||
				input.charAt(i)=='i'||
				input.charAt(i)=='o'||
				input.charAt(i)=='u')
			{
				vowelCount++;		
			}
		}
		System.out.printf("There are %d of vowels in the sentence",vowelCount);
	}
}
