import java.util.*;
import java.util.Scanner;
public class Task79 {
	public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-i;j++)
		{
			System.out.print("@ ");}
			for(int k=0;k<=2*i;k++)
			{
				System.out.print("% ");
			}
			for(int j=0;j<n-i;j++) {
				System.out.print("@ ");
			}
			System.out.println("");
		}
	}
	}

