import java.util.*;
import java.util.Scanner;
import java.lang.Math;
public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of a ::");
			double a=sc.nextInt();
			System.out.println("Enter the value of b ::");
			double b=sc.nextInt();
			System.out.println("Enter the value of c ::");
			double c=sc.nextInt();
			double d = b*b-4*a*c;
			if(d>0.0) {
				double r1=(-b + Math.pow(d,0.5))/(2*a);
				double r2=(-b - Math.pow(d,0.5))/(2*a);
				System.out.println("The Roots are "+r1+" and "+r2);
			}
			else if(d==0.0){
				double r1= (-b/(2.0*a));
				System.out.println("The roots is "+r1);
			}
			else {
				System.out.println("The roots are not real");
			}


	}

}
