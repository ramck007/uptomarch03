import java.util.*;
public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		Scanner sc= new Scanner(System.in);
		//int n= sc.nextInt();
		int n=5;
		for(int i=1;i<=n;i++) {
			int k =i;
			for(int j =1;j<=i;j++) {
				System.out.print(k+" ");
				k=k+n-j;
			}
			System.out.println("");
		}
	}

}
