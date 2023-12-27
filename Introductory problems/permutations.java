import java.util.*;
import java.io.*;
public class permutations {
	
	public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder ans =new StringBuilder();
		if(n == 1) {
			System.out.println(1);
			System.exit(0);
		}
		if(n <= 3) {
			System.out.println("NO SOLUTION");
			System.exit(0);
		}
		
		int temp = 2;
		while(temp <= n) {
			ans.append(temp);
			ans.append(" ");
			temp += 2;
		}
		
		temp = 1;
		while(temp <= n) {
			ans.append(temp);
			ans.append(" ");
			temp += 2;
		}
		
		System.out.println(ans);
	}
	
	
}