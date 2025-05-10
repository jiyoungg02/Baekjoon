import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int repeat = Integer.parseInt(st.nextToken());
		
		int[] list = new int[repeat];
		
		for(int i=0; i<repeat; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			list[i] = A+B;
		}
		
		for(int i=0; i<repeat; i++) {
			System.out.println(list[i]);
		}
		
		br.close();
		
	}
}