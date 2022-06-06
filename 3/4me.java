package cote;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
        int K = sc.nextInt();
        int round=0;
        int cal;
        
        while(N>1) {
        	cal=N%K;
        	if(cal==0) {
        		N/=K;
        		round++;
        	}
        	else {
        		N-=cal;        	
        		round+=cal;
        		if(N==0) {
        			N--;
        			round--;
        		}
        	}
        }
        System.out.println(round);
    }
}
