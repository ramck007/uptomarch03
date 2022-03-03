import java.util.Scanner;

public class Task75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		Scanner a = new Scanner(System.in);
		int n= a.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n-i;j++)
			{
				System.out.print(n-i +" ");
				
			}
			System.out.println("");
			
		}

	}

}
