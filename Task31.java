import java.util.Scanner;

public class Task31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the numbers to Swap");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int k;
		k=a;
		a=b;
		b=k;
		System.out.println("The Swapped Numbers are " +a+ "and "+ b);
	//	System.out.print(a);
		//System.out.print(" ");
		//System.out.print(b);
	}

}
