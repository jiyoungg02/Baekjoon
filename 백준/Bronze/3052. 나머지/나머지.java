import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[42];
		int n = 0;
		
		for(int i=0; i<10; i++) {
			int A = Integer.parseInt(br.readLine());
			if(arr[A%42] == 1) {
				continue;
			}
			arr[A%42]++;
		}
		
		for(int i=0; i<42; i++) {
			if(arr[i] == 1) {
				n++;
			}
		}
		
		System.out.println(n);
	}
}