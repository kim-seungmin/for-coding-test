
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{    	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder SB = new StringBuilder();
		
		HashSet<Integer> HS = new LinkedHashSet<>();
		
		int n = Integer.parseInt(st.nextToken());		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n;i++) {
			int num = Integer.parseInt(st.nextToken());
			HS.add(num);						
		}
		
		st = new StringTokenizer(br.readLine()," ");
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<m;i++) {		
			int answerNum = Integer.parseInt(st.nextToken());
			if(HS.contains(answerNum)) {
				SB.append("yes ");
			}else {
				SB.append("no ");
			}
		}
		System.out.println(SB.toString());
		
	}
}
