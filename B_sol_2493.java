import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B_sol_2493 {

	public static void main(String[] args) throws Exception{
		
		Stack<Integer> tower = new Stack<>();
		Stack<Integer> in = new Stack<>();
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=1;i<=T;i++) {
			int no = Integer.parseInt(st.nextToken());
			while(!tower.isEmpty()&&tower.peek()<no) {
				tower.pop();
				in.pop();
			}
			if(tower.isEmpty()) {
				sb.append(0+" ");
			}
			else {
				sb.append(in.peek()+" ");
			}
			tower.push(no);
			in.push(i);
			
		}
		System.out.print(sb);
	}
}
