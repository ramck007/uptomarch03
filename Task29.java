import java.util.Scanner;
public class Task29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Dividend and Divisor");
		Scanner sc=new Scanner(System.in);
		int div = sc.nextInt();
		int dir = sc.nextInt();
		System.out.println("1.Quotient 2.Remainder");
		Scanner c=new Scanner(System.in);
		int b = c.nextInt();
		
		switch(b)
		{
		case 1:
			System.out.println(div/dir);
			break;
		case 2:
			System.out.println(div%dir);
			break;
			
		
		}
	}

}
