import java.util.Scanner;
public class Task39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Factorial Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=1;
		for(int i=n;i>=1;i--)
		{
			k=k*i;
		}
		System.out.println(k);
	}

}
