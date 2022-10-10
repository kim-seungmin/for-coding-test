package cote;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {    	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] moneyArray = new int[n];
		int[] arr = new int[m+1];
		Arrays.fill(arr,10001);
		arr[0]=0;
		for(int i=0;i<n;i++) {
			moneyArray[i] = sc.nextInt(); 
		}
		
		for(int i=0;i<n;i++) {
			for(int j=moneyArray[i];j<=m;j++) {
				if(arr[j-moneyArray[i]]!=10001) {
					arr[j]=Math.min(arr[j], arr[j-moneyArray[i]]+1);
				}
			}
		}
		if(arr[m]==10001) {
			System.out.println("-1");
		}
		else {
			System.out.println(arr[m]);
		}
	}
}
