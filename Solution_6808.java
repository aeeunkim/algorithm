package algo0215;

import java.util.Scanner;

public class Solution_6808 {
	static int N;
	static int T;
	static int[] tt;
	static int[] gy;
	static int[] iy;
	static int ngy, niy;
	static boolean[]v;
	static int num[];
	public static void main(String[] args) {
		N=9;
		Scanner sc = new Scanner(System.in);
		T=sc.nextInt();
		for(int t=1;t<=T;t++) {
			tt=new int[N*2];
			gy = new int[N];
			iy=new int[N];
			ngy=0;
			niy=0;
			for(int i=0;i<N;i++) {
				gy[i] = sc.nextInt();
				tt[gy[i]-1]=1;
			}
			int x=0;
			for(int i=0;i<tt.length;i++) {
				if(tt[i]==0)
					iy[x++]=i+1;
			}
			num=new int[N];
			v=new boolean[N];
		nPm(0);
		System.out.println("#" + t + " " + ngy + " " + niy);
		}
	}
	private static void nPm(int cnt) {
		if(cnt==9) {
			int gsum=0;
			int isum=0;
			for(int i=0;i<N;i++) {
				if(gy[i]>num[i])
					gsum+=gy[i]+num[i];
				else if(gy[i]<num[i])
					isum+=gy[i]+num[i];
			}
			if(gsum>isum) 
				ngy++;
			else
				niy++;
			return;
		}
		for(int i=0;i<9;i++) {
			if(v[i]) continue;
			
			v[i]=true;
			num[cnt]=iy[i];
			nPm(cnt+1);
			v[i]=false;
					
		}
		
	}
}
