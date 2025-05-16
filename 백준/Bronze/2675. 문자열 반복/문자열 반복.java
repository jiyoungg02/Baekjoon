import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			for(int k=0; k<s.length(); k++) {
				for(int j=0; j<R; j++) {
					sb.append(s.charAt(k));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}