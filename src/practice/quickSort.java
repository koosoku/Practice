package practice;
import java.lang.Math;

public class quickSort {

	 	
	
	public static void main(String[] args){
		
		int[] numberArray ={4,3,2,1,5};
		System.out.print(toString(numberArray));
		quicksort(numberArray,0,numberArray.length-1);
		System.out.print(toString(numberArray));
	}
	
	public static void quicksort(int [] numberArray, int low, int high){
		if (low>=high)
			return;
		if (numberArray == null || numberArray.length == 0)
			return;
		
		int i = low;
		int j = high;
		int pivot = numberArray[(high+low)/2];
		
		
		while(i<=j){
			while(numberArray[i]<pivot){
				i++;
			}
			while (numberArray[j]>pivot){
				j--;
			}
			
			if(i<=j){
				int temp = numberArray[i];
				numberArray[i] = numberArray[j];
				numberArray[j] = temp;
				i++;
				j--;
			}
			
		}
		if(low < j)
			quicksort(numberArray,low,j);
		if(high > i)
			quicksort(numberArray,i,high);
		
	}
	public static String toString(int[] array){
		String output="";
		for(int i = 0; i<array.length; i++){
			output += array[i]+"\t";
		}
		output+="\n";
		return output;
	}
}
