import java.util.Scanner;
public class Task33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Character");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
		{
			System.out.println("The Given Character is Vowel");
		}
		else{
			System.out.println("The Given Character is Consonant");
		}

	}

}
