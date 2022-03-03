import java.util.Scanner;
public class Task27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter the year");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	//	if((n%4==0 && n%100!=0)||(n%400==0))
		if(n%4==0 && n%100!=0)
		{
			System.out.println("Leap year");
		
		}
		else if(n%400==0) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a Leap year");
		}
	

}
}
