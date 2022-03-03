import java.util.Scanner;

public class Task77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		Scanner a = new Scanner(System.in);
		int n= a.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*" +" ");
				
			}
			System.out.println("");
			
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("*" +" ");
				
			}
			System.out.println();
			
		}

	}

}
