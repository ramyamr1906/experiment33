package SUS;

import java.util.Scanner;


class Calculation{
	void sum(int n1,int n2){
		System.out.printf("Sum : %d + %d = %d \n", n1, n2,n1 + n2);
	}
	void diff(int n1,int n2){
		System.out.printf("Subtraction : %d - %d = %d \n", n1, n2,n1 - n2);
	}
	void div(int n1,int n2){
		System.out.printf("Division : %d / %d = %d \n", n1, n2,n1 / n2);
	}
	void mul(int n1,int n2){
		System.out.printf("Multiplication : %d * %d = %d \n", n1, n2,n1 * n2);
	}
}

public class Imposter7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		int n1 =  sc.nextInt();
		System.out.println("Enter number 2: ");
		int n2 =  sc.nextInt();
		
		System.out.println("Enter [Sum(1), Diff(2), Mul(3), Div(4)]: ");
		int cal = sc.nextInt();

		Calculation objc = new Calculation();

		if(cal == 3){
			objc.mul(n1,n2);
		}
		else if(cal == 1){
			objc.sum(n1,n2);
		}
		else if(cal == 4){
			objc.div(n1,n2);
		}
		else if(cal == 2){
			objc.diff(n1,n2);
		}
		else{
			System.out.println("..................................................Just Jump out of the window...................................................................");
		}
		
	}

}
