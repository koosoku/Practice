package practice;
import java.util.Scanner;

public class countWords {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Pleae enter a sentence");
		String input = in.nextLine();
		int count=0;
		
		for(int i =0; i<input.length();i++){
			if (input.charAt(i) == ' '&& input.charAt(i-1)!= ' '){
					count++;
			}
		}
		System.out.printf("There are %d of words in the sentence",count+1);
	}
}
