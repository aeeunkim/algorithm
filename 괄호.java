import java.util.Scanner;
import java.util.Stack;

public class 괄호 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t=0;t<10;t++) {
			int num=sc.nextInt();
			Stack<Character> st = new Stack<>();
			String sr = sc.next();
			char s;
			boolean f=true;
			char[]scc = sr.toCharArray();
			for(int i=0;i<num;i++) {
				if(scc[i]=='{'||scc[i]=='['||scc[i]=='(')
					st.add(scc[i]);
				else
				{
					s=st.pop();
					if((s=='{' && scc[i]=='}')||(s=='[' && scc[i]==']')||(s=='(' && scc[i]==')'))
						continue;
					else {
						f=false;
						break;
					}
				}
			}
			if(f==false)
				System.out.println(0);
			else
				System.out.println(1);
		}
	}
}
