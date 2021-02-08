import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class flatten {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			int num = sc.nextInt();
			int arr[] = new int[100];
			for(int j=0;j<100;j++) {
				arr[j]= sc.nextInt();
			}
			int diff=0;
			Arrays.sort(arr);
			for(int j=0;j<num;j++) {
				int min = arr[0];
				int max = arr[99];
				int min_index=-1;
				int max_index=-1;
				
				for(int k=0;k<100;k++) {
					
					if(min>arr[k]) {
						min=arr[k];
						min_index=k;
					}
					if(max<arr[k]) {
						max=arr[k];
						max_index=k;
					}
				}
				diff=max-min;
				arr[min_index]-=1;
				arr[max_index]-=1;
					
				if(diff<=0)
					diff=0;
				System.out.println(diff);
				}
				
			}
		}
}
