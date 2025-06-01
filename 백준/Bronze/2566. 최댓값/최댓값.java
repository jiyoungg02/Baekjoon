import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int max = Integer.MIN_VALUE;
		int n=0, m=0;
		
		for(int i=0; i<9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<9; j++) {
				int value = Integer.parseInt(st.nextToken());
				if(max < value) {
					max = value;
					n = i+1;
					m = j+1;
				}
			}
		}
		br.close();
		System.out.print(max + "\n" + n + " " + m + "\n");
	}
}