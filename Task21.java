import java.util.*;
import java.util.Scanner;
public class Task21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//) ++a-b–                   ii) a%b++     iii)  a*=b+5               iv) x=69>>>2
	System.out.println("Enter the two Numbers");
	Scanner sc= new Scanner(System.in);
	int a =sc.nextInt();
	int b= sc.nextInt();
	System.out.println("");
	System.out.print("i) ++a-b-- = ");
	System.out.println(++a-b--);
	//System.out.println(a);
	//System.out.println(b);
	System.out.print("ii) a%b++ = ");
	System.out.println(a%b++);
	//System.out.println(a);
	//System.out.println(b);
	System.out.print("iii) a*=b+5 = ");
	System.out.println(a*=b+5);
	//System.out.println(a);
	//System.out.println(b);
	System.out.print("iv) x=69>>>2 = ");
	System.out.println(69>>>2);
	}

}

