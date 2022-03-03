import java.util.Scanner;
public class Task38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the natural Number");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
		//	sum=sum+i;
			sum+=i;
		}
		System.out.println(sum);
	}

}
