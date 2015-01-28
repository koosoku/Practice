package practice;

public class pow {
	public static void main(String[] args){
		int result = pow(2,11);
		System.out.print(result);
	}
	public static int pow(int x, int n){
		if (n==0)
			return 1;
		else
		{
			if(n%2 == 0){
				return pow(x, n/2)*pow(x,(n)/2);
			}
			else
				return x*pow(x, n/2)*pow(x,(n)/2);
		}
	}
}
