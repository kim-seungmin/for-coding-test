# 그리디   
## 현재 상황에서 가장 좋아 보이는 것만을 선택하는 알고리즘   
단숙하지만 강력한 문제 해결방법
매순간 가장 좋아보이는것을 선택하며 나중에 미칠 영향에 대해서는 고려하지 않는다


<details>
<summary>1. 거스름돈</summary>
	거스름돈으로 사용할 500원, 100원, 50원, 10원 짜리 동전이 무한히 존재한다고 가정한다. 손님에게 거슬러 줘야 할 돈이 N원일 때 거슬러 줘야할 동전의 최소 개수를 구하라. 단, 거슬러 줘야할 돈 N은 항상 10의 배수이다.   

	
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



</details>
	
<details>
<summary>2. 큰수의 법칙</summary>
	다양한 수로 이루어진 배열이 있을때 주어진 수들을 M번 더하여 가장 큰수를 만들어라. 단, 연속으로 K번 이상 더할수 없다   
  

나     

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
	
책     

	public class Main {

    		public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// N, M, K를 공백을 기준으로 구분하여 입력 받기
        	int n = sc.nextInt();
        	int m = sc.nextInt();
        	int k = sc.nextInt();

        	// N개의 수를 공백을 기준으로 구분하여 입력 받기
        	int[] arr = new int[n];
        	for (int i = 0; i < n; i++) {
            	arr[i] = sc.nextInt();
        	}

        	Arrays.sort(arr); // 입력 받은 수들 정렬하기
        	int first = arr[n - 1]; // 가장 큰 수
        	int second = arr[n - 2]; // 두 번째로 큰 수

        	// 가장 큰 수가 더해지는 횟수 계산
        	int cnt = (m / (k + 1)) * k;
        	cnt += m % (k + 1);

        	int result = 0;
        	result += cnt * first; // 가장 큰 수 더하기
        	result += (m - cnt) * second; // 두 번째로 큰 수 더하기

        	System.out.println(result);
    		}
	}   

</details>

<details>
<summary>3. 숫자카드게임</summary>
	N x M 형태의 카드 배열중 하나를 뽑고 다음행에선 그보다 작은 숫자 카드를 뽑아 최종적으로 가장 높은 숫자의 카드를 뽑을수 있도록 전략을 세워야 한다  
  


나     

	public class Main {
    		public static void main(String[] args) {    	
    	 		Scanner sc = new Scanner(System.in);
		
         		int m = sc.nextInt();
         		int n = sc.nextInt();         
	         
		        int card[][] = new int[m][n];
         		int min[]= new int [m];
         		for(int i=0;i<m;i++) {
        	 		for(int j=0;j<n;j++) {
        		 		card[i][j] = sc.nextInt();
        		 		if(min[i]==0||min[i]>card[i][j]) {
        			 		min[i]=card[i][j];
        		 		}        		 
        	 		}        	 
         		}
         		int max = 0;
         		for(int i=0;i<m;i++) {
        	 		if(max<min[i])max=min[i];
         		}         
         		System.out.println(max);
    		}
	}
	
책     

		public class Main {

    			public static void main(String[] args) {
        		Scanner sc = new Scanner(System.in);

        		// N, M을 공백을 기준으로 구분하여 입력 받기
        		int n = sc.nextInt();
        		int m = sc.nextInt();
        		int result = 0;
	
		        // 한 줄씩 입력 받아 확인하기
        		for (int i = 0; i < n; i++) {
            			// 현재 줄에서 '가장 작은 수' 찾기
            			int min_value = 10001;
            			for (int j = 0; j < m; j++) {
                			int x = sc.nextInt();
                			min_value = Math.min(min_value, x);
            			}
            		// '가장 작은 수'들 중에서 가장 큰 수 찾기
            		result = Math.max(result, min_value);
        		}

        		System.out.println(result); // 최종 답안 출력
    			}
	
		}

</details><details>
<summary>4. 1이 될 떄 </summary>
	N이 K로 나누어 떨어질경우 K로 나누며 나누어 떨어지지 않을경우 1을 뺸다 
  
나     

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

책     

	public class Main {

    		public static void main(String[] args) {
        		Scanner sc = new Scanner(System.in);

        		// N, K를 공백을 기준으로 구분하여 입력 받기
        		int n = sc.nextInt();
        		int k = sc.nextInt();
        		int result = 0;

        		while (true) {
            			// N이 K로 나누어 떨어지는 수가 될 때까지만 1씩 빼기
            			int target = (n / k) * k;
            			result += (n - target);
            			n = target;
            			// N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
            			if (n < k) break;
            			// K로 나누기
            			result += 1;
            			n /= k;
        		}

        	// 마지막으로 남은 수에 대하여 1씩 빼기
        	result += (n - 1);
        	System.out.println(result);
    		}
	}


</details>

