import java.util.Scanner;
public class Task42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the two Numbers");
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		int g=0;
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				g=i;
			}
		}
		System.out.println("The GCD of "+a+" and "+b+" is : "+g);
	}

}
