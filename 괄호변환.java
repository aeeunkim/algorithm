package 하반기;

import java.util.Stack;

public class 괄호변환 {

	public static void main(String[] args) {
		System.out.println(solution(")("));
	}
	 public static String solution(String p) {
		 String answer="";
		 answer=solve(p);
		 return answer;
	    }
	private static String solve(String p) {
		if(p.length()==0)return "";
		//u,v 나누기
		int idx = div(p);
		String u=p.substring(0,idx);
		String v = p.substring(idx,p.length());
		if(check(u)) 
			return u+solve(v);
		else {
			String temp = "("+solve(v)+")";
			u=u.substring(1,u.length()-1);
			u=reverse(u);
			return temp+u;
		}
	}
	private static String reverse(String u) {
		String s="";	
		for (int i = 0; i <u.length(); i++) {
			char t = u.charAt(i);
			if(t=='(')s+=')';
			else s+='(';
		}
		return s;
	}
	private static boolean check(String u) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < u.length(); i++) {
			char s = u.charAt(i);
			if(s=='(') {
				st.add(s);
			}else {
				if(st.isEmpty())return false;
				else st.pop();
			}
		}
		return true;
	}
	private static int div(String p) {
		int s=0;
		int e=0;
		int i=0;
		for (i = 0; i < p.length(); i++) {
			if(p.charAt(i)=='(')s++;
			else e++;
			if(s==e)return i+1;
		}
		return i;
	}

}
