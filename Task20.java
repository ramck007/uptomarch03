import java.util.*;
import java.util.Scanner;
public class Task20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int n1=n,n2=n;
		System.out.println("Prefix Operator");
		System.out.println(++n1);
		System.out.println("Postfix Operator");
		System.out.println(n2++);
	}

}
