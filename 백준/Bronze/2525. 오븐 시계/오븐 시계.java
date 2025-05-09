import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		int C1, C2;
		
		if(C>=60) {
			C1 = C/60;
			C2 = C%60;
		} else {
			C1 = 0;
			C2 = C;
		}
		
		if((A+C1)<=23) {
			A += C1;
			if((B+C2)<60) {
				B += C2;
			} else {
				A++;
				if(A == 24) A = 0;
				B = (B+C2) - 60;
			}
		} else {
			A = A+C1-24;
			if((B+C2)<60) {
				B += C2;
			} else {
				A++;
				if(A == 24) A = 0;
				B = (B+C2) - 60;
			}
		}
		
		System.out.println(A + " " + B);

	}
}