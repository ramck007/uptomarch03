import java.util.*;
public class Pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n-i+1;j<=n;j++) {
				System.out.print(j+ " "); 
			}
			for(int k=i+1;k<=n;k++) {
				System.out.print(5+ " ");
			}
			System.out.println("");
		}
	}

}
