import java.util.Scanner;
public class Task62a {
	  
	public static long octToBin(int n) {
    int decimalNumber = 0, i = 0;
    long binaryNumber = 0;

    while (n != 0) {
      decimalNumber += (n % 10) * Math.pow(8, i);
      ++i;
      n /= 10;
    }

    i = 1;

    while (decimalNumber != 0) {
      binaryNumber += (decimalNumber % 2) * i;
      decimalNumber /= 2;
      i *= 10;
    }

    return binaryNumber;
  }
  public static void main(String[] args) {

	  System.out.println("Octal to Binary");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int bin = (int) octToBin(n);
		System.out.println(n + " = "+ bin);
	
}
}