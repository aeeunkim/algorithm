package algo0210;

import java.util.Scanner;

public class Solution_sw1954달팽이 {
	static int N;
	static int T;
	static int[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T=sc.nextInt();
		for(int t=1;t<=T;t++) {
			N=sc.nextInt();
			arr=new int[N][N];
			int turn=1;
			int cnt=1;
			int y=0;
			int x=-1;
			while(N>0) {
				
				for(int i=0;i<N;i++) {
					x+=turn;
					arr[y][x]=cnt;
					cnt++;
				}
				N--;
				for(int j=0;j<N;j++) {
					y+=turn;
					arr[y][x]=cnt;
					cnt++;
				}
				turn*=-1;
			}
			System.out.println("#"+t);
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

}
