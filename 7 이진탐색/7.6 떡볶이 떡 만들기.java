import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {    	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		int start=0;
		int end = 0;
		int result=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			end = Math.max(end, arr[i]);
		}
		
		while(start<=end) {
			int total=0;
			int mid = (start+end)/2;
			for(int i=0; i<n; i++) {
				if(arr[i]>mid) total +=arr[i] - mid;				
			}
			if(total < m) {
				end = --mid;
			}
			else {
				result=mid;
				start=mid+1;
			}
		}
		System.out.println(result);		
		
	}
}
