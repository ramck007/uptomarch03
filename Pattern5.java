import java.util.*;
public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//int n= sc.nextInt();
		int n=5;
		for(int i=0;i<n;i++) {
			//for(int j=0;j<i;j++) {
				//System.out.print(" ");
			//}
			for(int j=n-i;j>0;j--) {
				System.out.print(j);
			}
			System.out.println("");
		}
		for(int i=1;i<=n;i++) {
			for(int j=i;j>0;j--) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}

}
