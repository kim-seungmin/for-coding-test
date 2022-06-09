# 그리디   
## 현재 상황에서 가장 좋아 보이는 것만을 선택하는 알고리즘   
단숙하지만 강력한 문제 해결방법
매순간 가장 좋아보이는것을 선택하며 나중에 미칠 영향에 대해서는 고려하지 않는다


<details>
<summary>거스름돈</summary>
	거스름돈으로 사용할 500원, 100원, 50원, 10원 짜리 동전이 무한히 존재한다고 가정한다. 손님에게 거슬러 줘야 할 돈이 N원일 때 거슬러 줘야할 동전의 최소 개수를 구하라. 단, 거슬러 줘야할 돈 N은 항상 10의 배수이다.   
  
책     

		public class Main {    
			public static void main(String[] args) {    
			int n = 1260;    
			int cnt = 0;    
			int[] coinTypes = {500, 100, 50, 10};		
      			
 	   	    for (int i = 0; i < 4; i++) {
   		         int coin = coinTypes[i];
    		        cnt += n / coin;
      		      n %= coin;
    		    }
			
		        System.out.println(cnt);
 		   }
			
		}

나     

		class Main {
			public static void main(String args[]) {		
    			int N=1260;
    			int coin500=N/500;
    			N-= coin500*500;
    			int coin100=N/100;
    			N-= coin100*100;
    			int coin50=N/50;
    			N-= coin50*50;
    			int coin10=N/10;
    			System.out.println("500: "+coin500+" 100: "+coin100+" 50: "+ coin50+" 10:"+ coin10+" 횟수: "+(coin500+coin100+coin50+coin10));
  		  	}
		}


</details>
