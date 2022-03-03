import java.util.Scanner;
public class Task41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1;
		int n3,n;
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.print(n1 +" "+n2+ " ");
		while(n>0)
		//for(int i=n;i>0;i--)
		{
			n3=n2+n1;
			System.out.print(n3+ " ");
			n1=n2;
			n2=n3;
			n--;
		}
		
	}

}
