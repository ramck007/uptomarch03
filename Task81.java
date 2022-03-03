import java.io.*;
import java.util.*;
import java.lang.Math;

public class Task81 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc= new Scanner(System.in);
    int a =sc.nextInt();
    int b =sc.nextInt();
    int n =sc.nextInt();
    for(int i=0;i<n;i++)
    {
        int s=a += (int)Math.pow(2, i);
        //int length = (int) (Math.log10(number) + 1);
        System.out.print(s);
    }
    }
    
}