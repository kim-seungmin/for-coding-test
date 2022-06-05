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
