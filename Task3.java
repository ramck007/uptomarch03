import java.util.Scanner;
import java.util.*;
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the two numbers");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		long b=sc.nextLong();
		if(a==b)
		{
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}
	}

}
