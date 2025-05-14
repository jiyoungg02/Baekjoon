import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = Integer.MIN_VALUE;
		double sum = 0.0;
		
		double[] arr = new double[N];
		
		for(int i=0; i<N; i++) {
			int score = Integer.parseInt(st.nextToken());
			if(score > max) {
				max = score;
			}
			arr[i] = score;
		}
		
		for(int i=0; i<N; i++) {
			sum = sum + arr[i]/max*100;
		}
	
		System.out.println(sum/N);
		
		br.close();
	}
}