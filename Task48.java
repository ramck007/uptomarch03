import java.util.Scanner;
public class Task48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int k,a=0,b;
		k=n;
		while(n!=0)
		{
			b=n%10;
			a=a*10+b;
			n=n/10;
			
		}
		if(k==a)
		{
			System.out.println("The Given Number is Palindrome");
		}
		else {
			System.out.println("The Given Number is not a Palindrome");
		}
	}

}
