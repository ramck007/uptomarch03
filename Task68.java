import java.util.Scanner;
import java.util.*;

public class Task68 {

	public static void mulMat(int[][]a,int[][]b,int m,int n)
	{
		int c[][]=new int[m][n];
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++){
			for(int k=0;k<n;k++) {
			c[i][j]+=a[i][k]*b[k][j];
		}
	}}
	System.out.println("The Result of Mutiplication Matrix ");
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(c[i][j] +" ");
		}
		System.out.println("");
	}
}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Matrix Dimension");
		Scanner sc= new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		
		System.out.println("Enter the Values for the first Matrix");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the Values for the Second Matrix");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		mulMat(a,b,m,n);
		
}
}