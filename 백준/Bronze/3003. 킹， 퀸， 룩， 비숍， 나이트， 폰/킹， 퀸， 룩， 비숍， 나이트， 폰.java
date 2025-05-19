import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] n = {1, 1, 2, 2, 2, 8};
		StringTokenizer st = new StringTokenizer(br.readLine());
		int p;
		
		for(int i=0; i<n.length; i++) {
			p = Integer.parseInt(st.nextToken());
			n[i] -= p;
			System.out.print(n[i] + " ");
		}
		System.out.println();
	
	}
}