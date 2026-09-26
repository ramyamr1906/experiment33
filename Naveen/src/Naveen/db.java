package Naveen;

public class db {

	public static void main(String[] args) {
			int a = Integer.parseInt(args[0]);
			int fact=1;
			for(int i=1;i<=a;i++) {
				fact=fact*i;
			}
			System.out.println("Factorial of N numbers is"+fact);


	}

}
