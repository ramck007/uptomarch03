import java.util.Scanner;
public class Task40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Table Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=16;i++)
		{
			System.out.println(i +" X "+n+" = "+ i*n  );
		}
	}

}
