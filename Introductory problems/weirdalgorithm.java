import java.util.*;
import java.lang.*;
import java.io.*;
    
public class weirdalgorithm {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        while (n > 1)
        {
            System.out.print(n + " ");
            if (n%2==1)
                n = 3 * n + 1;
            else
                n = n / 2;
        }
        System.out.print(n);
    }
    
}
