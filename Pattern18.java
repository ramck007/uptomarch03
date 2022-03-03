import java.util.Scanner;
public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		Scanner sc= new Scanner(System.in);
		//int n=sc.nextInt();
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int k=2;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		for(int i=1;i<=n;i++) {
			for(int k=n-1;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=n-i+1;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}

}
