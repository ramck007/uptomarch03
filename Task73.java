import java.util.Scanner;
public class Task73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		Scanner a = new Scanner(System.in);
		int n= a.nextInt();
    	for(int i=1;i<=n;i++)
		{
			//for(int j=n-i;j>=1;j--)	
			
			for(int k=1;k<=(2*n)-2*i;++k)
			{
				System.out.print(" ");
			}
			//for(int j=1,k=2;j<=i&&k<=i;j++,k++)
			for(int j=n-i+1;j<=n;j++)
			{
				System.out.print(j +" ");
				
			}
			for(int j=n-1;j>n-i;j--)
			{
				System.out.print(j +" ");
				
			}
			System.out.println("");
			
		}

		/*for(int i=1;i<=n;i++)
	{
			//for(int j=n-i;j>=1;j--)
			{
				//System.out.print(" ");
			}
			for(int j=n-1;j>n-i;j--)
			{
				System.out.print(j );
				
			}
			System.out.println("");
}*/
}
}


