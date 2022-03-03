import java.util.*;
import java.util.Scanner;
public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ternary Operator");
		System.out.println("Enter three Numbers");
		Scanner sc= new Scanner (System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		System.out.println("The Greatest Number "+((a>b)?((a>c)?a:c):((b>c)?b:c)));

	}

}
