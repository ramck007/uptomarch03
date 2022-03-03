import java.util.*;
import java.util.Scanner;
public class Task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Biwise Opertors");
		System.out.println("Enter the Numbers");
		Scanner sc= new Scanner(System.in);
		int a =sc.nextInt();
		int b= sc.nextInt();
		System.out.println("1.Bitwise And \n2.Bitwise Xor \n3.Bitwise OR \n4.Bitwise Complement \n5.Bit Shift Operator");
		int n =sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Bitwise And");
			System.out.println("a&b = "+(a&b));
			break;
		case 2:
			System.out.println("Bitwise Xor");
			System.out.println("a^b = "+(a^b));
			break;
		case 3:
			System.out.println("Bitwise Or");
			System.out.println("a|b = "+(a|b));
			break;
		case 4:
			System.out.println("Bitwise Complement");
			System.out.println("~a = "+(-(~a)));
			break;
		case 5:
			System.out.println("Bitwise Shift Operator");
			System.out.println("Bitwise Left Shift" );
			System.out.println("a<<b"+(a<<b));
			System.out.println("Bitwise Right Shift" );
			System.out.println("a>>b"+(a>>b));
			System.out.println("Bitwise Unsigned Right Shift" );
			System.out.println("a>>>b"+(a>>>b));
			break;
		default:
			System.out.println("Enter from 1 to 5");
			break;
		}
		
	}

}
