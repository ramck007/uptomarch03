import java.util.*;
import java.util.Scanner;
public class Task83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=2;i++) {
			for(int k=1;k<=3-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i;j++) {
				System.out.print("*");
			}
			for(int k=1; k<=2*(2-i+1)-1; k++)   
	         {
	             System.out.print(" ");
	         } 
	         for(int j=1; j<=2*i; j++)
	         {
	             System.out.print("*");
	         }
			System.out.println("");
		}
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
			 
				System.out.print(" ");
			}
			for(int j=1;j<=2*(n-i+1)-1;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
			
		}
	}

}
