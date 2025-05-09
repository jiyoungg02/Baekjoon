import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int money;
		
		if(a==b && b==c) {
			money = 10000 + a*1000;
		} else if(a!=b && b!=c && c!=a) {
			int max = a > b ? a : b;
			max = max > c ? max : c;
			money = max * 100;
		} else {
			int s = a==b ? a : c;
			money = 1000 + s * 100;
		}
		
		System.out.println(money);
	}
}