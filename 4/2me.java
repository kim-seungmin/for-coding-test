public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int time = sc.nextInt();
    	int total =0;
    	for(int i=0; i <= time; i++) {
    		for(int j=0; j<60;j++) {
    			for(int k=0;k<60;k++) {
    				 if (i % 10 == 3 || j / 10 == 3 || j % 10 == 3 || k / 10 == 3 || k % 10 == 3) total++;
    			}
    		}
    	}
        System.out.println(total);
    }
}
