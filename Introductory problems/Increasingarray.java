import java.util.*;
public class Increasingarray
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try (Scanner sc = new Scanner(System.in)) {
            int t=sc.nextInt();
            long ans=0;
            int[] a=new int[t];
            for(int i=0;i<t;i++){
                a[i]=sc.nextInt();
            }
            for(int i=1;i<t;i++){
                if(a[i]<a[i-1]){
                    ans+=a[i-1]-a[i];
                    a[i]=a[i-1];
                }
            }
            System.out.println(ans);
        }
    }
}