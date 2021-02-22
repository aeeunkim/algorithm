package algo0219;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_추 {
	static int T,N;
	static int arr[];
	static boolean v[];
	static int res1[];
	static int res2[];
	static int cnt;
	static int sum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T=sc.nextInt();
		for(int t=1;t<=T;t++) {
			N=sc.nextInt();
			arr=new int[N];
			res1=new int[N];
			res2=new int[N];
			v=new boolean[N];
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
			}
			cnt=0;
			subset(0);
			System.out.println(cnt);
		}
	}
	private static void subset(int cnt) {
		if(cnt==N) {
			for(int i=0;i<N;i++) {
				if(v[i]) {
					res1[i]=arr[i];
					res2[i]=0;
				}
				else {
					res2[i]=arr[i];
					res1[i]=0;
				}
			}
				check();
				return;
		}
		v[cnt]=true;
		subset(cnt+1);
		
		v[cnt]=false;
		subset(cnt+1);
	}
	private static void check() {
		int sum1=0;
		int sum2=0;
		int cc=0;
		for(int i=0;i<res1.length;i++) {
			sum1+=res1[i];
			if(res1[i]==0) {
				cc+=1;
			}
		}
		for(int i=0;i<res2.length;i++) {
			sum2+=res2[i];
		}
		if(sum1<sum2) {
			sum=0;
			combi(0,0,cc);
			System.out.println(Arrays.toString(res1));
			System.out.println(sum);
			cnt+=sum*2;
		}
		return;
	}
	private static void combi(int cnt,int start, int cc) {
		if(cnt==cc) {
			sum+=1;
		}
		for(int i=start;i<N;i++) {
			combi(cnt+1,i+1,cc);
		}
	}

}
