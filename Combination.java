import java.util.Arrays;

public class Combination {
	static int R,N;
	static int num[];
	static int result[];
	static int tot;
	public static void main(String[] args) {
		N=5;
		R=3;
		num=new int[]{1,2,3,4,5};
		result = new int[R];
		combi(0,0);
		System.out.println("총 개수 "+tot);
	}
	private static void combi(int cnt, int start) {
		if(cnt==R) {
			tot++;
			System.out.println(Arrays.toString(result));
			return;
		}
		for(int i=start;i<N;i++) {
			result[cnt]=num[i];
			combi(cnt+1,i+1);
		}
	}

}
