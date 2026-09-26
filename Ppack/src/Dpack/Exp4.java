package Dpack;

public class Exp4 {

	public static void main(String[] args) {
		 int a = Integer.parseInt(args[0]);
	        int b = Integer.parseInt(args[1]); 
	        int temp;
	        System.out.printf("Before Swapping:- \n a : %d \n b : %d", a,b);
	        temp = a;
	        a = b;
	        b = temp;
	        System.out.printf("\nAfter swapping:- \n a : %d \n b : %d",a,b);
	}

}
