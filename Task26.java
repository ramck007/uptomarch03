import java.util.Scanner;

public class Task26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. km to Miles  2. centigrade to fahrenheit  3. sqft to acre ");
		Scanner a = new Scanner(System.in);
		int n= a.nextInt();
		switch(n){
		case 1: 
			double km;
			System.out.println("Enter the Kilometer values");
			Scanner b = new Scanner(System.in);
			km = b.nextInt();
			double miles=km/1.6;
			System.out.printf(miles +" Miles");
			break;
		case 2:
			double centi;
			System.out.println("Enter the Centigrade values");
			Scanner c = new Scanner(System.in);
			centi = c.nextInt();
			double faren =centi *1.8+32 ;
			System.out.printf(faren +" Fahrenheit");
			break;
		case 3:	
			double sqft;
			System.out.println("Enter the Squarefeet values");
			Scanner d = new Scanner(System.in);
			sqft = d.nextInt();
			double acre =sqft /43560;
			System.out.printf(acre +" Acre");
			break;
		}
	}

}
