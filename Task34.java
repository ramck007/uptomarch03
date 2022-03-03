import java.util.Scanner;
public class Task34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter three Numbers");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("The Number "+a+" is Gretaer");
		}
		else if(b>a && b>c)
		{
			System.out.println("The Number "+b+" is Gretaer");
		}
		//if(c>b && c>a)
		else
		{
			System.out.println("The Number "+c+" is Gretaer");
		}
	}

}
