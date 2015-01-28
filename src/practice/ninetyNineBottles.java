package practice;

public class ninetyNineBottles {
	public static void main(String args[]){
	
		String[] tens = {"","Ten","Twenty", "Thirty" ,"Fourty" ,"Fifty","Sixty", "Seventy","Eighty","Ninety"};
		String[] ones = {"Nine","Eight","Seven","Six","Five","Four","Three","Two","One",""};
		String[] tenTo19 = {"Nineteen","Eighteen","Seventeen","Sixteen","Fifteen","Fourteen","Thirteen","Twelve","Eleven"};
		
		for (int i = 99; i>0; i--){
			String print = "";
			
			if(i>10 && i<20){
				print+=tenTo19[9-i%10];
			}
			else{
				print+= tens[(i / 10)];
				if(i/10!=0 && i%10!=0)
					print+="-";
				print+= ones[9-(i%10)];
			}
			System.out.println(print);
		}
	}

	
/*
 * Needs:
 * 3 Arrays. 
 * 	one for [ninety, eighty,.....twenty]
 * 	one for [nine,eight.....one]
 * 	one for [nineteen,eighteen.....ten]
 * 
 * 
 * 
 * 
 * */
}
