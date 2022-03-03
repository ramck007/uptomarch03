import java.util.*;
import java.util.Scanner;
public class Task91 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");;
		//int n= sc.nextInt();
		int n=7;
		for(int i=0;i<n;i++) {
			for(int k=0;k<n-i;k++){System.out.print(" ");}
			for(int j=0;j<=i;j++) {
				System.out.print("/");
			
			}
			for(int j=0;j<i;j++) {
				System.out.print("\\");
			
			}if(i==0) {
			for(int j=0;j<=19;j++) {
				System.out.print("**");
			}}else {//int k=5;
				for(int j=0;j<=19;j++) {
				System.out.print("  ");
				//k--;
			}}
			for(int j=1;j<=n-i;j++) {
			//	if(j==2) {
				System.out.print("#");
			}
			System.out.println("");
			}for(int i=0;i<=7;i++) {
				for(int j=0;j<=27;j++) {
				System.out.print("**");}
				System.out.println("");
			}
		
		
	}

}
