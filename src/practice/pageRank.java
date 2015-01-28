package practice;
import java.util.Scanner;

public class pageRank {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		System.out.println("Enter Number of Sites: ");
		int numOfSites = s.nextInt();
		
		double adjacencyMatrix[][] = new double[numOfSites][numOfSites];
		
		for (int i = 1; i<=numOfSites; i++){
			// when i tried to use s.nextline it errors, why
			System.out.printf("Please Enter the Sites site: %d is linked to:\n",i);
			String str = b.nextLine();
			String[] tmp = str.split(" ");
			
			for(int j = 0; j<tmp.length;j++){
				adjacencyMatrix[Integer.parseInt(tmp[j])-1][i-1]= 1.0/tmp.length;
			}
		}
		for(int i = 0; i <numOfSites ; i++){
			for(int j=0; j<numOfSites; j++){
				System.out.printf("%.2f ",adjacencyMatrix[i][j]);
			}
			System.out.println();
		}
		for(int i = 0; i <numOfSites ; i++){
			adjacencyMatrix[i][i] = adjacencyMatrix[i][i] -1;
		}
		for(int i = 0; i <numOfSites ; i++){
			for(int j=0; j<numOfSites; j++){
				System.out.printf("%.2f ",adjacencyMatrix[i][j]);
			}
			System.out.println();
		}
		double[] determinantFactors = new double[adjacencyMatrix.length];
		int flipFactor = REFSolver.gaussianElimination(adjacencyMatrix, determinantFactors);
		System.out.println(REFSolver.determinantSolver(adjacencyMatrix, determinantFactors, flipFactor));
		
		for(int i = 0; i <numOfSites ; i++){
			for(int j=0; j<numOfSites; j++){
				System.out.printf("%.2f ",adjacencyMatrix[i][j]);
			}
			System.out.println();
		}
		
		rank(adjacencyMatrix);
		
	}
	public static double[] rank(double[][] adjacencyMatrix){
		double[]recorder = new double[adjacencyMatrix.length];
		recorder[adjacencyMatrix.length-1] = 1;
		for(int i = 1; i<adjacencyMatrix.length;i++){
			for(int j = 0; j<i; j++){
				recorder[adjacencyMatrix.length-1-i] -= adjacencyMatrix[adjacencyMatrix.length-1-i][adjacencyMatrix.length-1-j]*recorder[recorder.length-j-1];
			}
		}
		for(int i =0; i<recorder.length;i++){
			for(int j = 1; j<recorder.length;j++){
				recorder[i] = recorder[i]*j;
			}
			System.out.print(recorder[i]+"  ");
		}
		
		return recorder;
	}
}
