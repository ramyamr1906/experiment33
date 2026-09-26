package Dpack;

public class Exp5 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		if (a >= 18){
		 	System.out.println("Is eligible for voting");}
		else if ( a < 18  &&  a > 0){
			System.out.println("Is not eligible for voting");}
		else {
			System.out.print("He doesen't exist");
		}

	}

}
