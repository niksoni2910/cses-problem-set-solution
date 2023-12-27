import java.util.Scanner;

public class numberspiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder str = new StringBuilder();
		while (t-- > 0) {
			long y = sc.nextLong();
			long x = sc.nextLong();
			long maxVal = Math.max(y, x);
			long minVal = Math.min(y, x);
			long valBottomRight = maxVal * maxVal - (maxVal - 1);
			if (maxVal % 2 == 0) {
				if (y == minVal) {
					str.append(valBottomRight - (maxVal - minVal) + "\n");
				} else if (x == minVal) {
					str.append(valBottomRight + (maxVal - minVal) + "\n");
				}
			} else {
				if (y == minVal) {
					str.append(valBottomRight + (maxVal - minVal) + "\n");
				} else if (x == minVal) {
					str.append(valBottomRight - (maxVal - minVal) + "\n");
				}
			}
		}
		System.out.println(str);
    }
}
