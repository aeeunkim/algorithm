import java.util.Scanner;

public class Main_색종이 {
	static int doh[][]=new int [100][100];
	static int T;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int to=0;
		T=sc.nextInt();
		for (int t = 0; t < T; t++) {
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			for(int i=num2;i<num2+10;i++) {
				for(int j=num1;j<num1+10;j++) {
					doh[i][j] = 1;
				}
			}
		}
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(doh[i][j]==1)
					to+=1;
			}
		}
		System.out.println(to);
	}

}
