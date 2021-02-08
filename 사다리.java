import java.util.Scanner;

public class 사다리 {

	static int dc[]= {1,-1,0};
	static int dr[] = {0,0,-1};
	static int tot;
	static int arr[][] = new int[100][100];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		int dx=0,dy=0;
		for(int t=0;t<10;t++) {
			num = sc.nextInt();
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
					if (arr[i][j] == 2) {
						dx = j;
						dy = i;
					}
				}
			}
			go(dx, dy);
			System.out.println("#" + num + " " + tot);
		}
	}

	private static void go(int dx, int dy) {
		if(dy==0) {
			tot=dx;
			return;
		}
		for(int i=0;i<3;i++) {
			int x=dx+dc[i];
			int y=dy+dr[i];
			if(y>=0 && x>=0 && y<100 && x<100 && arr[y][x]==1) {
				go(x,y);
			}
		}
	}

}
