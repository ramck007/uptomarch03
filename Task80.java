import java.util.Scanner;
import java.util.*;
public class Task80 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the sentence");
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine(); 
		//Task63 st =new Task63();
		int l = s.length();
		System.out.print("The reversed Sentence: ");
		for(int i=l-1;i>=0;i--) {
		System.out.print(s.charAt(i));
		}
	}

}
