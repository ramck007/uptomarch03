import java.util.*;
public class Task23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter a number");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	n= n++ *2 + 3 * --n;
	System.out.println(n);
	}

}
//2*2+3*2