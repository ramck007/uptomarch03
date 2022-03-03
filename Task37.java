import java.util.Scanner;

public class Task37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Character");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		int a=ch;
		if((a>=97 && a<=122) || (a>=65 && a<=90))
		{
			System.out.println("The Character is Alphabet");
		}
		else
		{
			System.out.println("The Character is not an Alphabet");
		}

	}

}
