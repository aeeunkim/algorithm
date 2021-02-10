package algo0210;

import java.util.Scanner;

public class Main_백준16926_배열돌리기 {
	static int T,N,M;
	static int arr[][];
	static int res[][];
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		T=sc.nextInt();
		count=Math.min(N,M)/2;
		int x=0;
		int y=0;
		int d=1;
		arr=new int[N][M];
		res=new int[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		while(count>=0) {
			for(int i=1;i<N;i++) {
				y+=d;
				if(d>0)
					res[y][x]=arr[y-1][x];
				else
					
					res[y][x]=arr[y+1][x];
			}
			System.out.println("c"+x+" "+y);
			for(int j=1;j<M;j++) {
				x+=d;
				if(d>0)
					res[y][x]=arr[y][x-1];
				else
					res[y][x]=arr[y][x+1];
			}
			System.out.println("a"+x+" "+y);
			if(d==-1) {
				N=N-2;
				M=M-2;
				x++;
				y++;
				count--;
				//arr=deepCopy(res);	
			}
			System.out.println("b"+x+" "+y);
			d*=-1;
		}
		for(int[] is:res) {
			for(int i:is) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

    private static int[][] deepCopy(int[][] original2) {
        if(original2 == null) return null;
        int[][] result = new int[original2.length][original2[0].length];
         
        for(int i=0; i<original2.length; i++){
            System.arraycopy(original2[i], 0, result[i], 0, original2[0].length);
        }
         
        return result;
    }

}
