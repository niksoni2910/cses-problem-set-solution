import java.util.*;
import java.lang.*;
import java.io.*;

public class missingnumber
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long t=(long)n*(n+1)/2;
        while(n-1>0){
            t-=sc.nextInt();
            n--;
        }
        System.out.println(t);
    }
}

