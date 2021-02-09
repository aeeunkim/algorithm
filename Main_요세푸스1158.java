package algo0209;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_요세푸스1158 {
	static ArrayList<Integer> arr = new ArrayList<>();
	static StringBuilder sb = new StringBuilder();
	static int N,K;
	public static void main(String[] args) {
		String sbb;
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			arr.add(i);
		}
		sb.append('<');
		cal(0);
		sbb=sb.substring(0, sb.length()-2);
		sbb+=('>');
		System.out.println(sbb);
		cal(1);

	}
	private static void cal(int start) {
		if(arr.isEmpty()) return;
		else{
			int temp=start+K-1;
			if(temp>arr.size()) {
				temp=temp%arr.size();
			}
			sb.append(arr.get(temp)+", ");
			arr.remove(temp);
			cal(temp);
		}
	}

}
