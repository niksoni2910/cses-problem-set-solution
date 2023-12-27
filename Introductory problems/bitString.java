import java.util.Scanner;

public class bitString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int mod=1000000007;
        int ans=1;
        while(t-->0){
            ans=(ans*2)%mod;
        }
        System.out.println(ans);
    }
}
