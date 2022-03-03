import java.util.*;
import java.util.Scanner;
public class Task84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		int maxValue=0,count=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]>=maxValue) {
				maxValue=arr[i];
				count++;
			}
		}
		System.out.println(count);
		                                                      
	}

}
