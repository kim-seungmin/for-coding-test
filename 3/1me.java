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
