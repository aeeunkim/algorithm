import java.util.Arrays;

public class subset {

	static int[] aa = {1,2,3};
	static int tot;
	static int result[];
	static boolean[] isSelected;
	static int res;
	public static void main(String[] args) {
		isSelected=new boolean [aa.length];
		sub(0,0);
		System.out.println("개수"+tot);
		System.out.println("총합"+res);
		
	}
	private static void sub(int i,int sum) {
		if(i==aa.length) {
			for(int j=0;j<i;j++) {
				if(isSelected[j])
					System.out.print(aa[j]);
			}
			System.out.println();
		//	System.out.println(Arrays.toString(result));
			tot++;
			res+=sum;
			return;
		}
		isSelected[i] = true;
		sub(i+1,sum+aa[i]);
		isSelected[i]=false;
		sub(i+1,sum);
	
		
		
	}

}
