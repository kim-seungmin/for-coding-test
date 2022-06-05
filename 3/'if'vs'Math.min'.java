public class Main {
    public static void main(String[] args) {    	
    	long beforeTime1 = System.currentTimeMillis();
    	 
    	for(int i=0;i<1000000;i++) {
    		 int a = 0;
        	 int b = 10;
    		 if(b>a)b=a;
    	 }  
    	
    	long afterTime1 = System.currentTimeMillis();
 		long secDiffTime1 = (afterTime1 - beforeTime1);
 		System.out.println("시간차이(ms) : "+secDiffTime1);// 2~4ms
    	 
 		
    	long beforeTime2 = System.currentTimeMillis();
    	
    	 for(int i=0;i<1000000;i++) {
    		 int a = 0;
    		 int b = 10;
    		 b = Math.min(b,a);
    	 }
    	 
    	long afterTime2 = System.currentTimeMillis();
 		long secDiffTime2 = (afterTime2 - beforeTime2);
 		System.out.println("시간차이(ms) : "+secDiffTime2);// 1~2ms
    }
}
