import java.util.*;

public class Main {
	public static int[][] map;
	static int n;
	static int m;
	public static void main(String[] args) {    	
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		int count = 0;
		map = new int[n][m];
		System.out.println(n+" "+m);
		String numLow = sc.nextLine();

		for(int i=0;i<n;i++) {
			numLow = sc.nextLine();
			for(int j=0;j<m;j++) {
				map[i][j] = numLow.charAt(j)-'0';
			}
		}
		
		for(int i=0;i<n;i++) {        	 
			for(int j=0;j<m;j++) {
				if(map[i][j]==0) {
					count++;
					findMelt(i,j);
				}
			}
		}
	}

	private static void findMelt(int x, int y) {
		map[x][y]=1;
		if(x+1 < n ) {
			if(map[x+1][y]==0) {
				findMelt(x+1,y);
			}
		}
		
		if(x > 0) {
			if( map[x-1][y]==0) {
				findMelt(x-1,y);
			}
		}
		
		if(y+1 < m) {
			if(map[x][y+1]==0) {
				findMelt(x,y+1);
			}
		}
		
		if(y>0) {
			if(map[x][y-1]==0) {
				findMelt(x,y-1);
			}
		}
	}
}
