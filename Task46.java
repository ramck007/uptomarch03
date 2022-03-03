import java.util.Scanner;
public class Task46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int c=0,k=0,j=0;
		while(n>0)
		{
			j=n%10;
			k=k*10+j;
			n=n/10;
		}
		System.out.println("The Reverse of the Number is : "+k);

	}

}