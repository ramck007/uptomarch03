import java.util.*;
import java.util.Scanner;
public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the radius and height");
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		int h=sc.nextInt();
		double c=2*3.14*r*(h+r);
		
		System.out.println("Area of the Cylinder ="+c);
	}}
