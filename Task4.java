import java.util.*;
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the two numbers");
		Scanner sc= new Scanner(System.in);
		float a=sc.nextFloat();
		double b=sc.nextDouble();
		if(a==b)
		{
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}
	}

}
