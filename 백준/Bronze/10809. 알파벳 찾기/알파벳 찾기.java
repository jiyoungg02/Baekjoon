import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		for(char ch = 'a'; ch<='z';ch++) {
			sb.append(str.indexOf(ch)+" "); // 문자열의 위치를 반환, 없으면 -1을 출력
		}
		System.out.println(sb);
	}
}