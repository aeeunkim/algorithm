import java.util.Scanner;

public class hanoi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		hanoi(n,1,2,3);

	}

	private static void hanoi(int cnt, int from, int temp, int to) {
		if(cnt==0) return;
		
		hanoi(cnt-1,from,to,temp);
		System.out.println(cnt+":"+from+"->"+to);
		hanoi(cnt-1,temp,from,to);
		
	}

}
