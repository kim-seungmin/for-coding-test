
import java.io.IOException;
import java.util.*;

public class Main {
	static int start=0;
	static int end=0;
	public static int findN(int N, int[] arr) {
		int mid = start+end/2;
		if(arr[mid]==N)return mid;		
		if(arr[mid]<N)start=mid;
		else end=mid;		
		if(start>end)return 0;
		return findN(N,arr);
	}
	public static void main(String[] args) throws IOException{    	
		int[] arr = {0,2,4,6,8,10,12,14,16,18};
		end=arr.length;
		System.out.println(findN(4,arr));
	}
}
