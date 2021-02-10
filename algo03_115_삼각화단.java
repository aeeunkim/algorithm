package algo0210;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class algo03_115_삼각화단 {

	static class Tri{
		int A;
		int B;
		int C;
		public Tri() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Tri(int a, int b, int c) {
			super();
			A = a;
			B = b;
			C = c;
		}
		@Override
		public String toString() {
			return "Tri [A=" + A + ", B=" + B + ", C=" + C + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + A;
			result = prime * result + B;
			result = prime * result + C;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			Tri other = (Tri) obj;
			if (A != other.A)
				return false;
			if (B != other.B)
				return false;
			if (C != other.C)
				return false;
			return true;
		}
		
	}
	static int count;
	static HashSet<Tri> ts = new HashSet<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		ts.clear();
		dfs(N,1,1,1);
		System.out.println(ts.size());//목표
		Iterator<Tri> t=ts.iterator();
		for(;t.hasNext();) {
			System.out.println(t.next());
		}
	}
	private static void dfs(int n, int a, int b, int c) {
		if(a+b+c==n) {
			if(a+b>c && a+c>b&& b+c>a && a<=b &&b<=c) {
				ts.add(new Tri(a,b,c));
			}
			return;
		}
		dfs(n,a+1,b,c);
		dfs(n,a,b+1,c);
		dfs(n,a,b,c+1);
		
	}

}
