import java.util.Scanner;
public class Task47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number: ");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the Power: ");
		//Scanner sc= new Scanner(System.in);
		int b=sc.nextInt();
		int r=1,k;
		k=b;
		while(b!=0)
		{
			r*=a;
			b--;
		}
		System.out.println("The answer for the "+a+" to the Power of "+k+" is: "+r);
	}

}
