import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		
		
		int a = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		int b = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		if(a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}