public class Main {
	public static int dx;
	public static int dy;
	public static int turned=0;
	public static int d;
	public static int[][] map;
	public static boolean out = true;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int moved=0;
		int turning = 0;

		dx = sc.nextInt();
		dy = sc.nextInt();
		d = sc.nextInt();

		map = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				map[i][j]=sc.nextInt();
			}
		}
		map[dx][dy]=2;		

		while(out) {
			System.out.println(moved+" "+dx+" "+dy+" "+turning);
			switch(d) {
			case 0:    		
				if(map[dx-1][dy]==0) {
					turning=0;
					dx--;
					map[dx][dy]=2;
					moved++;
				}else {
					if(turning==4) {
						turning=0;
						dx++;
						if(map[dx][dy]==1)out=false;
					}
					turnleft();
					turning++;
				}

				break;
			case 1:
				if(map[dx][dy+1]==0) {
					turning=0;
					dy++;
					map[dx][dy]=2;
					moved++;
				}else {
					if(turning==4) {
						turning=0;
						dy--;
						if(map[dx][dy]==1)out=false;
					}
					turnleft();
					turning++;
				}
				break;
			case 2:
				if(map[dx+1][dy]==0) {
					turning=0;
					dx++;
					map[dx][dy]=2;
					moved++;
				}else {
					if(turning==4) {
						turning=0;
						dx--;
						if(map[dx][dy]==1)out=false;
					}
					turnleft();
					turning++;
				}
				break;
			case 3:
				if(map[dx][dy-1]==0) {
					turning=0;
					dy--;
					map[dx][dy]=2;
					moved++;
				}else {
					if(turning==4) {
						turning=0;
						dy++;
						if(map[dx][dy]==1)out=false;
					}
					turnleft();
					turning++;
				}
				break;
			}


		}
		System.out.println(moved+1);
	}

	private static void turnleft() {
		d--;
		if(d==-1)d=3;		
	}
}
