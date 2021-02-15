import java.util.Scanner;

public class Main_백준_2961 {
	static int T;
	static int[]sin;
	static int[]ssun;
	static int min=Integer.MAX_VALUE;
	static int valsin, valssun;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T=sc.nextInt();
		sin=new int[T];
		ssun=new int[T];
		for(int i=0;i<T;i++) {
			sin[i]=sc.nextInt();
			ssun[i]=sc.nextInt();
		}
		subset(0,1,0);
		System.out.println(min);
		
	}
	private static void subset(int cnt,int sumsin,int sumssum) {
		if(cnt==T) {
			if(sumsin==1 && sumssum==0)
				return;
			int sum=Math.abs(sumsin-sumssum);
			min=Math.min(min, sum);
			return;
		}
		subset(cnt+1,sumsin,sumssum);
		subset(cnt+1,sumsin*sin[cnt],sumssum+ssun[cnt]);
		
	}
	

}
