import java.util.Scanner;
import java.util.*;
public class Task67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Matrix Dimension");
		Scanner sc= new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		int at[][]=new int[n][m];
		System.out.println("Enter the Values for the Matrix");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				at[j][i]=a[i][j];
			}
		}
		System.out.println("The Result of Addition Matrix ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(at[i][j] +" ");
			}
			System.out.println("");

	}
	}
}


