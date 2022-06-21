public class Main {
    public static void main(String[] args) {    	
    	 Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();
         int y=1;
         int x=1;
         sc.nextLine();
         String[] plan = sc.nextLine().split(" ");
         
         for(String p: plan) {        	 
        	 switch(p) {
         		case("L"):
         			if(y-1>0) y--;
         			break;
         		case("R"):
         			if(y+1<=n)y++;
         			break;
         		case("U"):
         			if(x-1>0)x--;
         			break;
         		case("D"):
         			if(x+1<=n)x++;
         			break;
         		default:
         			break;
         	}
         }
         System.out.println(x+" "+y);
    }
}
