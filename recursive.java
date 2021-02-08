//2차원 한원소씩 호출
public class recursive {

	static int num[][];
	public static void main(String[] args) {
		num = new int[][] {{1,2,3},{4,5,6}};
		System.out.println(num.length);
		recur(0,0);
	}

	private static void recur(int i, int j) {
		if(i==num.length) {
			return;
		}
		System.out.print(num[i][j]);
		if(j==num[i].length-1) {
			System.out.println();
			recur(i+1,0);
		}
		else {
		recur(i,j+1);
		}
		
	}
	

}
