import java.util.Scanner;

public class Task71 {

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

	}

}
