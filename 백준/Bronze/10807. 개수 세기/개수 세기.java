import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int result = 0;
		
		int[] list = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n ; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		int v = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			result = list[i] == v ? result + 1 : result;
		}
		
		System.out.println(result);
		
	}
}