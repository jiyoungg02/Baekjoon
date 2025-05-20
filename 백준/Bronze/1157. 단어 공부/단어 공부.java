import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] num = new int[26];
		
		for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
			if(ch < 91) { // 대문자인가?
				num[ch - 65]++;
			} else { // 아니면 소문자
				num[ch - 97]++;
			}
		}
		
		int max = Integer.MIN_VALUE;
		int index = 0;
		
		for(int i=0; i<num.length; i++) {
			if(max < num[i]) {
				max = num[i];
				index = i;
			} else if(num[i] == max) {
				index = -2; // '?' = 63이다.
			}
		}
		System.out.println((char) (index + 65));
		
	}
}