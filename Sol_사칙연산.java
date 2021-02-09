package algo0209;

import java.util.Scanner;

public class Sol_사칙연산 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for(int t=1;t<=10;t++) {
			int num = sc.nextInt();
			int result=1;
//			boolean arr[]=new boolean[num];
			for(int i=0;i<num;i++) {
				sc.next();
				char sr =sc.next().charAt(0);
				sc.next();
				sc.next();
				if(i<num/2) {
					if(sr!='-'&&sr!='+'&&sr!='*'&&sr!='/') {
						result=0;
					}
					else
						result=1;
				}
				else {
					if(sr=='-'||sr=='+'||sr=='*'||sr=='/') {
						result=0;
					}
				}
			}
			System.out.println("#"+t+" "+result);
		}

	}

}
