import java.util.Arrays;
import java.util.Scanner;

public class Main_백준3040 {
	static int num[];
	static boolean V[];
	static int res[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num=new int[9];
		res=new int[7];
		V=new boolean[100];
		for(int i=0;i<9;i++) {
			num[i]=sc.nextInt();
		}
		nCr(0,0,0);
	}
	private static void nCr(int cnt, int start,int sum) {
		if(cnt==7) {
			if(sum==100) {
				for(int i=0;i<res.length;i++) {
					System.out.println(res[i]);
				}
			}
			return;
		}
		for(int i=start;i<9;i++) {
			res[cnt]=num[i];
			nCr(cnt+1,i+1,sum+num[i]);
		}
		
	}

}
