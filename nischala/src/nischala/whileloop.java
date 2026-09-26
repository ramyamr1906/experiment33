package nischala;
import  java.util.Scanner;
public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, sum=0;
		double avg;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n:");
int n=sc.nextInt();
while(i<=n) {
	sum+=i;
	i++;
}
avg=(double)sum/n;
System.out.println("sum"+sum);
System.out.println("Average"+avg);

	}

}
