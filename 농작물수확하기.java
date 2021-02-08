import java.util.Scanner;

public class 농작물수확하기 {
	static int T;
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T=sc.nextInt();
		n=sc.nextInt();
		for(int t=0;t<T;t++) {
			int tot=0;
			int arr[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				String sr = sc.next();
				for (int j = 0; j < n; j++) {
					arr[i][j] = sr.charAt(j)-'0';
				}
			}
			int s = n / 2;
			for (int i = 0; i < n; i++) {
				if(i<=s) {
					for(int j=-i;j<=i;j++) {
						tot+=arr[i][s+j];
						System.out.println(arr[i][s+j]);
					}
					System.out.println(i);
				}
				else {
					for(int j=-(n-i-1);j<=n-i-1;j++) {
						tot+=arr[i][s+j];
						System.out.println(arr[i][s+j]);	
					}
				}
				
			}
			System.out.println(tot);
		}
	}

}
