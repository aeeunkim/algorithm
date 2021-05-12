package algo0513;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_21608_상어초 {
	static class shark implements Comparable<shark>{
		int x,y,em,li;

		public shark(int x, int y, int em, int li) {
			super();
			this.x = x;
			this.y = y;
			this.em = em;
			this.li = li;
		}

		@Override
		public int compareTo(shark o) {
			if(this.li == o.li) {
				if(this.em==o.em) {
					if(this.y==o.y) {
						return this.x-o.x;
					}else return this.y-o.y;
				}else return o.em-this.em;
			}else return o.li-this.li;
		}
		
	}
	static int N;
	static int like[][];
	static int arr[][];
	static int []dx = {-1,1,0,0};
	static int []dy = {0,0,-1,1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		like = new int[N*N+1][4];
		arr=new int[N][N];
		StringTokenizer st = null;
		for (int n = 0; n <N*N; n++) {
			st=new StringTokenizer(br.readLine()," ");
			int s=Integer.parseInt(st.nextToken());
			for(int i=0;i<4;i++)
				like[s][i]=Integer.parseInt(st.nextToken());
			shark sh =check(s);
			arr[sh.y][sh.x]=s;
		}
		int result=0;
		for (int k = 0; k < N; k++) {
			for (int i = 0; i < N; i++) {
				int temp = 0;
				int res = arr[k][i];
				for (int j = 0; j < 4; j++) {
					int li = like[res][j];
					for (int d = 0; d < 4; d++) {
						int y = k+dy[d];
						int x = i + dx[d];
						if (y < 0 || x < 0 || y >= N || x >= N)
							continue;
						if (arr[y][x] == li) {
							temp++;
							break;
						}
					}
				}
				int answer=0;
				if(temp==0) answer=0;
				else if(temp==1)answer=1;
				else if(temp==2)answer=10;
				else if(temp==3)answer=100;
				else if(temp==4)answer=1000;
				result+=answer;
			}
		}
		System.out.println(result);
	}
	private static shark check(int s) {
		PriorityQueue<shark> pq = new PriorityQueue<>();
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(arr[i][j]==0) {
					int res[]=go(i,j,s);
					int em = res[0];
					int li = res[1];
					pq.add(new shark(j,i,em,li));
				}
			}
		}
		return pq.poll();
	}
	private static int[] go(int y, int x, int s) {
		int bin=0;
		int lo=0;
		for(int i=0;i<4;i++) {
			int ch = like[s][i];
			for(int d=0;d<4;d++) {
				int my = dy[d]+y;
				int mx = dx[d]+x;
				if(my<0 || mx<0 || my>=N || mx>=N) continue;
				if(ch==arr[my][mx])lo++;
				else if(arr[my][mx]==0) bin++;
			}
		}
		return new int[] {bin,lo};
	}

}
