import java.util.Scanner;

public class sol_한빈이와spotmart {
	
	static int T;
	static int N;
	static int M;
	static int arr[];
	static int num[];
	static int max;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		T=sc.nextInt();
		for(int t=1;t<=T;t++) {
			N=sc.nextInt();
			M=sc.nextInt();
			arr=new int[N];
			num=new int[2];
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
			}
			max=Integer.MIN_VALUE;
			nCr(0,0);
			System.out.println("#"+t+" "+max);
		}

	}
	private static void nCr(int cnt, int start) {
		if(cnt==2) {
			int tot=0;
			for(int i=0;i<2;i++) {
				tot+=num[i];
			}
			if(tot>M) {
				tot=-1;
			}
			max=Math.max(tot, max);
			return;
		}
		for(int i=start;i<N;i++) {
			num[cnt]=arr[i];
			nCr(cnt+1,i+1);
		}
	}

}
