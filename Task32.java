import java.util.Scanner;

public class Task32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0)
		{
			System.out.println("The Given Number "+n+" is EVEN");
		}
		else
		{
			System.out.println("The Given Number "+n+" is ODD");
		}
	}

}
