import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int b = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= b/4; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
		
	}
}