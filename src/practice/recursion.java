package practice;

public class recursion {

	public static int factorial(int num){
		if(num==0){
			return 1;
		}
		return num*factorial(num-1);
	}
	public static int fibonacci(int num){
		if(num == 1 || num ==0){
			return 1;
		}
		return fibonacci(num-2) + fibonacci(num-1);
	}
	public static int triangle(int num){
		if(num == 0){
			return 0;
		}
		return triangle(num-1)+num;
	}
	public static int sumDigits(int num){
		if(num/10 == 0){
			return num;
		}
		return sumDigits(num/10)+num%10;	
	}
	
	public static int count7(int num){
		if(num ==0)
			return 0;
		if((num%10) == 7)
			return 1 + count7(num/10);
		return count7(num/10);
	}
	
	public static int count8(int num){
		if(num ==0)
			return 0;
		if((num%10) == 8){
			if(num/10 %10 == 8)
				return 2+count8(num/10);
			return 1 + count8(num/10);
		}
		return count8(num/10);
	}
	
	public static int powerN(int base, int n){
		if(n == 1){
			return base;
		}
		return powerN(base,(n+1)/2)*powerN(base,n/2);
		
	}
	public static int countX(String s){
		if (s.length() == 0)
			return 0;
		if (s.charAt(s.length()-1)== 'x'){
			s = s.substring(0,s.length()-1);
			return 1 + countX(s);
		}
		s = s.substring(0,s.length()-1);
		return countX(s);
	}
	
	
	public static void main(String[] args){
		System.out.println();
	}
}
