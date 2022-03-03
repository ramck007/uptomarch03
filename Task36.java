import java.util.Scanner;
public class Task36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to check Positive or Negative");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Postive Number");
		}
		else if(n<0)
		{
			System.out.println("Negative Number");
		}
		else {
			System.out.println("It's Zero");
		}
	}

}
