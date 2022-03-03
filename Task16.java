import java.util.*;
import java.util.Scanner;
public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the radius of two Circles");
		Scanner sc = new Scanner(System.in);
		int r1=sc.nextInt();
		int r2=sc.nextInt();
		double c=(3.14*r1*r1)-(3.14*r2*r2);
		
		System.out.println("The space between the circles ="+c);
	}}
