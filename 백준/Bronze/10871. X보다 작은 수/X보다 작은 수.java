import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		int[] list = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N ; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<N; i++) {
			if(list[i] < X) {
				sb.append(list[i]).append(" ");
			}
		}
		
		System.out.println(sb);
		
	}
}