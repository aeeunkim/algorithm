import java.util.Arrays;

public class nextpermutation {
	static int[] P= {1,2,3,4,5};
	static int tot;
	public static void main(String[] args) {
		do {
			System.out.println(Arrays.toString(P));
			tot++;
		}while(np(P.length-1));
		System.out.println("총 개수"+tot);
	}
	private static boolean np(int cnt) {
		int i=cnt;
		while(i>0 && P[i-1]>=P[i])i--;
		if(i==0) return false;
		int j=cnt;
		while(P[i-1]>=P[j])j--;
		int temp=P[i-1];
		P[i-1]=P[j];
		P[j]=temp;
		int k=cnt;
		while(i<k) {
			temp=P[k];
			P[k]=P[i];
			P[i]=temp;
			i++;
			k--;
		}
		return true;
	}

}
