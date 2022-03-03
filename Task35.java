import java.util.*;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Math.*;
public class Task35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //double secondRoot = 0, firstRoot = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of a ::");
			double a=sc.nextInt();
			System.out.println("Enter the value of b ::");
			double b=sc.nextInt();
			System.out.println("Enter the value of c ::");
			double c=sc.nextInt();
			if(a==0)
			{
				System.out.println("The value cannot of a cannot be zero");
			}
			double d = b*b-4.0*a*c;
			//double s= sqrt(abs(d));
			if(d>0) {
				System.out.println("The roots of the equation are real and different. \n");  
				//System.out.println((double)(-b + s) / (2 * a) + "\n"+ (double)(-b - s) / (2 * a)); 
				double r1=(-b + Math.pow(d,0.5))/(2*a);
				double r2=(-b - Math.pow(d,0.5))/(2*a);
				System.out.println("The Roots are "+r1+" and "+r2);
			}
			else if(d==0){

				System.out.println("The roots of the equation are real and same. \n");
				double r1= (-b/(2.0*a));
				System.out.println(r1+"\n"+r1);
			}
			else {
				System.out.println("The roots of the equation are complex and different. \n");
				//System.out.println("The roots are not real");
				double r1= (-(double)b/(2.0*a));
				System.out.println(r1+"+i"+((double)Math.pow(d,0.5))+"\n"+r1+"-i"+((double)Math.pow(d,0.5)));
			}
	
			
			
			
			
			
			
			
			
			/* double determinant = (b*b)-(4*a*c);
		      double sqrt = Math.sqrt(determinant);
		      
		    
		      if(determinant>0){
		          firstRoot = (-b + sqrt)/(2*a);
		          secondRoot = (-b - sqrt)/(2*a);
		          System.out.println("Roots are :: "+ firstRoot +" and "+secondRoot);
		       }else if(determinant == 0){
		          System.out.println("Root is :: "+(-b + sqrt)/(2*a));
		       }*/

	}

	/*private static double sqrt(Object abs) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static Object abs(int d) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
