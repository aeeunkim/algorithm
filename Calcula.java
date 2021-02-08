import java.util.Scanner;
import java.util.Stack;

public class Calcula {
	
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Stack<Character> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=10;i++) {
			int n=sc.nextInt();
			String s=sc.next();
			for(int j=0;j<n;j++) {
				char k =s.charAt(j);
				if(k=='*'||k=='+') {
					if(st.isEmpty()) {
						st.add(k);
					}
					else {
						while(!st.isEmpty()&&pri(st.peek())<=pri(k)) {
							sb.append(st.pop());
						}
						st.add(k);
					}
				}
				else
					sb.append(k);
					
			}
			while(st.size()>0) {
				sb.append(st.pop());
			}
			//System.out.println(sb);
			System.out.println("#"+i+" "+cal(sb));
		}
		
	}
	private static int pri(Character peek) {
		if(peek=='*')
			return 1;
		else 
			return 2;
	}
	static int cal(StringBuilder sb2) {
		Stack<Integer> st = new Stack<>();
		int res=0;
		for(int i=0;i<sb2.length();i++) {
			char temp = sb2.charAt(i);
			//System.out.println(temp);
			if(temp=='*'||temp=='+') {
				if(temp=='+') {
					int result=0;
					for(int j=0;j<2;j++) {
						//System.out.println(result+"!");
						result+=st.pop();
						//System.out.println(result);
					}
					st.add(result);
					//System.out.println(result);
				}
				else {
					int result=1;
					for(int j=0;j<2;j++) {
						result*=st.pop();
					}
					st.add(result);
				}
			}
			else {
				//System.out.println(st.size());
				st.add(temp-'0');
			}
		}
		res=st.pop();
		return res;
	}
}
