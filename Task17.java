import java.util.*;
import java.util.Scanner;
public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Unary Opertors");
		System.out.println("Enter the Number");
		Scanner sc= new Scanner(System.in);
		int a =sc.nextInt();
		System.out.println("1.unary Plus \n 2.Unary Minus \n 3.Increment operator \n 4.Decrement Operator \n 5.Logical Operator");
		int n =sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("The Number Given is "+a);
			System.out.println("Unary Plus");
			//System.out.println("+"+a);
			System.out.println(+a);
			break;
		case 2:
			System.out.println("The Number Given is "+a);
			System.out.println("Unary Minus");
			//System.out.println("-"+a);
			System.out.println(-a);
			break;
		case 3:
			System.out.println("The Number Given is "+a);
			System.out.println("Increment Opertor");
			System.out.println("++"+a );
			System.out.println(++a);
			System.out.println(a+"++");
			System.out.println(a++);
			break;
		case 4:
			System.out.println("The Number Given is "+a);
			System.out.println("Decrement Opertor");
			System.out.println("--"+a );
			System.out.println(--a);
			System.out.println(a+"--");
			System.out.println(a--);
			break;
		case 5:
			boolean flag = true;
			System.out.println("Logical Opertor");
			System.out.println(flag );
			System.out.println("!"+flag);
			System.out.println(!flag );
			break;
		}
		
	}

}
