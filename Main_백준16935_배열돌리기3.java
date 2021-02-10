import java.util.Scanner;

public class Main_백준16935_배열돌리기3 {
	static int N,M,T;
	static int arr[][];
	static int cou[];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		T=sc.nextInt();
		arr=new int[N+1][M+1];
		cou=new int [T];
		for(int i=1;i<=N;i++) {//배열 만들기
			for(int j=1;j<=M;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int t=0;t<T;t++) {
			cou[t]=sc.nextInt();
		}
		for(int i=0;i<T;i++) {
			switch(cou[i]) {
			case 1:
				sangha();
				break;
			case 2:
				jawoo();
				break;
			case 3:
				rig90();
				break;
			case 4:
				left90();
				break;
			case 5:
				grou1234();
				break;
			case 6:
				move();
				break;
			}
		}
		 for(int i=1;i<arr.length;i++) {
				for(int j=1;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
	}
	private static void move() {
		int result[][] = new int[arr.length][arr[0].length];
		int n = arr.length-1;
        int m = arr[0].length-1;
		for (int j = 1; j <= n / 2; j++) {
			for (int i = 1; i <= m / 2; i++) 
				result[j + n / 2][i] = arr[j][i];
		}
		for (int j = 1; j <= n / 2; j++) {
			for (int i = m / 2 + 1; i <= m; i++) 
				result[j][i - m / 2] = arr[j][i];
		}
		for (int j = n / 2 + 1; j <= n; j++) {
			for (int i = m / 2 + 1; i <= m; i++) 
				result[j - n / 2][i] = arr[j][i];
		}
		for (int j = n / 2; j <= n; j++) {
			for (int i = 1; i <= m / 2; i++) 
				result[j][m / 2 + i] = arr[j][i];
		}
		arr=result;

	}
	private static void grou1234() {
		int result[][] = new int [arr.length][arr[0].length];
		int n = arr.length - 1;
		int m = arr[0].length - 1;
		for (int j = 1; j <= n / 2; j++) {
			for (int i = 1; i <= m / 2; i++) 
				result[j][m / 2 + i] = arr[j][i];
		}
		for (int j = 1; j <= n / 2; j++) {
			for (int i = m / 2 + 1; i <= m; i++) 
				result[j + n / 2][i] = arr[j][i];
		}
		for (int j = n / 2 + 1; j <= n; j++) {
			for (int i = m / 2 + 1; i <= m; i++)
				result[j][i - m / 2] = arr[j][i];
		}
		for (int j = n / 2 + 1; j <= n; j++) {
			for (int i = 1; i <= m / 2; i++) 
				result[j - n / 2][i] = arr[j][i];
		}
		arr=result;
	}
	private static void left90() {
		int result[][] = new int[arr[0].length][arr.length];
		for (int i = 1, j = 1; j <= arr.length - 1; j++, i++) {
			for (int k = 1; k <= arr[0].length - 1; k++) {
				result[k][j] = arr[i][arr[0].length - k];
			}
		}
		arr=result;
	}
	private static void rig90() {
		int result[][] = new int[arr[0].length][arr.length];
		for (int i = 1, j = arr.length - 1; j >= 1; j--, i++) {
			for (int k = 1; k <= arr[0].length - 1; k++) {
				result[k][j] = arr[i][k];
			}
		}
		arr=result;
		
	}
	private static void jawoo() {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j <= arr[i].length/2; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][arr[i].length - j];
				arr[i][arr[i].length - j] = temp;
			}
		}
	}
	private static void sangha() {
		for (int i = 1; i <= arr.length/2; i++) {
			int[] temp = arr[i];
			arr[i] = arr[arr.length - i];
			arr[arr.length - i] = temp;
		}
	}
}
