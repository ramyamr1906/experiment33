package Dpack;

public class Exp6 {

	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		if (a % 2 ==0){
		 	System.out.printf( "%f is Even" , a);}
		else if ( a % 2 !=  0){
			System.out.printf("%f  is Odd", a);}
		else {
			System.out.printf("%f doesen't exist ",a);}
	}

}
