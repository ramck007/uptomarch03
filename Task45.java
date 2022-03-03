import java.util.Scanner;
public class Task45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		while(n>0)
		{
			n=n/10;
			c++;
		}
		System.out.println("The digits are : "+c);
	}

}
