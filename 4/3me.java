public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String place = sc.next();
        int y = place.charAt(1) - 48;
    	int x = place.charAt(0) - 96;
    	
    	int[][] move = {{2,1},{2,-1},{-2,1},{-2,-1},{1,2},{1,-2},{-1,2},{-1,-2}};
    	int count = 8;
    	for(int i=0;i<8;i++) {
    		int[] moved = move[i];
    		moved[0] += x;
    		moved[1] += y;
    		System.out.println(moved[0]+""+moved[1]);
    		if(moved[0]<=0||moved[0]>=8||moved[1]<=0||moved[1]>=8)count--;
    	}
        System.out.println(count);
    }
}
