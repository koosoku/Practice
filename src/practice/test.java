package practice;

public class test {

	   public static void main(String args[]) {
	     String s = "000000010400000000020000000000050407008000300001090000300400200050100000000806000";
	     for (int i =0; i<s.length();i++){
	    	 System.out.print(s.charAt(i));
	    	 if ((i+1)%9 == 0){
	    		 System.out.println();
	    	 }
	     }
	   }
}