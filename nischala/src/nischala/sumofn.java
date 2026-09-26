package nischala;

public class sumofn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
int [][]a= {{1,2},{3,4}};
int[][]b= {{5,6},{7,8}};
int[][]c =new int[2][2];
for(i=0;i<2;i++) {
	for(j=0;j<2;j++) {
		c[i][j]=a[i][j]+b[i][j];
	}
}
System.out.println("Resultant matrix:");
for(i=0;i<2;i++) {
	for(j=0;j<2;j++) {
		System.out.print(c[i][j] +"\t");
	}
	System.out.print("\n");
	}
	}

}
