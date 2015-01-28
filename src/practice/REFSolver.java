package practice;
import java.util.Scanner;

public class REFSolver {
	public static void main(String[] args){
		
		double[][] input = inputMatrix();
		int rows = input.length;
		double[] determinantFactors = new double[input.length];
		
		int flipFactor = gaussianElimination(input, determinantFactors);
		for (int i =0; i<rows; i++){
			for (int j=0; j<rows; j++){
				System.out.printf("%5.2f  ",input[i][j]);
			}
			System.out.println();
		}
		System.out.println(determinantSolver(input,determinantFactors,flipFactor));
		
	}
	public static double[][] inputMatrix(){
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a square matrix of size: .");
		System.out.println("Rows: ");
		int rows = s.nextInt();
		
		System.out.println("Please enter the matrix, horizontally");
		double[][] input = new double[rows][rows];
		for (int i =0; i<rows; i++){
			for (int j=0; j<rows; j++){
				input[i][j] = s.nextDouble();
			}
		}
		return input;
	}

	public static int gaussianElimination(double[][] inputMatrix, double[] determinantFactors){
		int flipFactor =1;
		//
		for (int j=0; j< inputMatrix[0].length; j++){
			for (int i=0+j; i<inputMatrix.length; i++){
				if (inputMatrix[i][j]>inputMatrix[j][j]){
					flipFactor *=-1;
					for (int a=0; a<inputMatrix[0].length;a++){
						double tmp = inputMatrix[i][a];
						inputMatrix[i][a] = inputMatrix[j][a];
						inputMatrix[j][a] = tmp;
					}
				}	
			}
		}
		//rows
		for (int i=0; i<inputMatrix.length; i++){
			//rows again
			for(int k=0; k<inputMatrix.length && i+k+1<inputMatrix.length && inputMatrix[i][i]!=0; k++){
				
				for (int j=i; j+1<inputMatrix[0].length; j++){	
					inputMatrix[i+1+k][j+1] = inputMatrix[i+1+k][j+1] - inputMatrix[i+1+k][i]/inputMatrix[i][i]*inputMatrix[i][j+1];
				}
			}
			
			determinantFactors[i] = inputMatrix[i][i];
			double tmp = inputMatrix[i][i];
			for (int j=0; j<inputMatrix[i].length && inputMatrix[i][i]!=0; j++){	
				if (Math.abs(tmp)>0.00000001)
					inputMatrix[i][j] = inputMatrix[i][j]/tmp;
			}
			
			for(int l=0; l<i;l++){
				inputMatrix[i][l] = 0;
			}
		}
		
		return flipFactor;
	}
	public static double determinantSolver(double[][] inputMatrix, double [] determinantFactors, int flipFactor){
		double determinant =1;
		for (int i=0;i<inputMatrix.length;i++){
			determinant *= inputMatrix[i][i]*determinantFactors[i];
		}
		if (Math.abs(determinant*flipFactor)> 0.00000001)
			return determinant*flipFactor;
		else
			return 0;
		
	}
}
