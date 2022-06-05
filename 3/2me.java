import java.util.*;

public class Main {
    public static void main(String[] args) {    	
    	 Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();
         int m = sc.nextInt();
         int k = sc.nextInt();
         
         int num[] = new int[2];
         
         for(int i=0;i<n;i++) {
        	 int getNum = sc.nextInt();
        	 if(num[0]<getNum) {
        		 num[1]=num[0];
        		 num[0]=getNum;
        	 }else if(num[1]<getNum) {
        		 num[1]=getNum;
        	 }
         }
         System.out.println(num[0]+" "+num[1]);
         int answer = 0;
         for(int i=0;i<m;i++) {
        	 if(i%k==k-1) {
        		 answer+=num[1];
        	 }else {
        		 answer+=num[0];
        	 }        	 
         }
         System.out.println(answer);
    }
}
