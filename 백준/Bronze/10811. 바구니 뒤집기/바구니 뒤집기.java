import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		for(int a=0; a<N; a++) {
			arr[a] = a;
		}
		
		for(int a=0; a<M; a++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken())-1;
			int j = Integer.parseInt(st.nextToken())-1;
			
			for(int b=i; b<=(i+j)/2; b++) {
				int temp = arr[b];
				arr[b] = arr[j-(b-i)];
				arr[j-(b-i)] = temp;
			}
		}
		
		for(int a=0; a<N; a++) {
			System.out.print(arr[a]+1 + " ");
		}
		
		br.close();
	}
}