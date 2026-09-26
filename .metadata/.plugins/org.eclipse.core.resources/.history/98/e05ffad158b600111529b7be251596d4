package shrav;
import java.util.Scanner;
public class TwoD {
	public static void main(String args[]) {
		int  N=Integer.parseInt(args[0]);
		int a[][]=new int[N][N];
		int b[][]=new int[N][N];
		int c[][]=new int[N][N];
		Scanner sc=new  Scanner(System.in);
		for(int i=0;i<N;i++) {
			for( int j=0;j<N;j++) {
				a[i][j] =sc.nextInt();
			}
		}
		for(int i=0; i<N; i++) {
			for( int j=0; j<N; j++) {
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<N; i++) {
			for( int j=0; j<N; j++) {
				System.out.print("\t"+a[i][j]);
			}
			System.out.println("\n");
		}
		for(int i=0; i<N; i++) {
			for( int j=0; j<N; j++) {
				System.out.print("\t"+b[i][j]);
			}
			System.out.println("\n");
		}
		for(int i=0; i<N; i++) {
			for( int j=0; j<N; j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print("\t"+c[i][j]);
			}
			System.out.println("\n");
		}
	}
}	
		