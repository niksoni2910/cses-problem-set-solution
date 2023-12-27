import java.util.*;
import java.lang.*;
import java.io.*;

public class Repetitions
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        String t=sc.next();
        int cout=1;
        int max=1;
        for(int i=1;i<t.length();i++){
            if(t.charAt(i)==t.charAt(i-1)){
                cout++;
                max=Math.max(max,cout);
            }else{
                cout=1;
            }
        }
        System.out.println(max);
    }
}
