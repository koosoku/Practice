package practice;
import java.util.Scanner;

//move chars before first vowel to end, add ay, if word starts with vowel, add way.
public class pigLatin {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a word to be translated to pig latin");
		String input = in.next();
		String output = "";
		String piglatin = "way";
		for(int i = 0;i<input.length();i++){
			if(	input.charAt(i)=='a'||
				input.charAt(i)=='e'||
				input.charAt(i)=='i'||
				input.charAt(i)=='o'||
				input.charAt(i)=='u')
			{				
					if (i==0){
						output = input + "way";
						break;
					}
					else{
						output = input.substring(i) + input.substring(0,i)+"ay";
						break;
					}
			}						
		}
		System.out.print(output);
		

	}
}