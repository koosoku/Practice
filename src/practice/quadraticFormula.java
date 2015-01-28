package practice;
import java.util.Scanner;

public class quadraticFormula {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please Enter the coefficient for x squared");
		double xsquare = s.nextInt();
		System.out.println("Please Enter the coeiffient for x");
		double x = s.nextInt();
		System.out.println("Please Enter the constant");
		double constant = s.nextInt();
		
		double root1 = (-x+Math.sqrt(x*x-4*xsquare*constant))/2*xsquare;
		double root2 = (-x-Math.sqrt(x*x-4*xsquare*constant))/2*xsquare;
		
		
		System.out.print(root1+ "    " + root2);
	}

}
