import java.util.Scanner;

public class twoKinights {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 1; i <= t; i++) {
            long iSquared = (long) i * i;
            long total = (iSquared * (iSquared - 1)) / 2;
            long attack = 4 * (i - 1) * (i - 2);
            
            System.out.println(total - attack);
        }
    }
}
