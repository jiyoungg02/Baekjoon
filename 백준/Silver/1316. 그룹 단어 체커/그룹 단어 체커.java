import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		for(int i=0; i< num; i++) {
			if(checkStr(br.readLine()) == true) {
				count++;
			}
		}
		br.close();
		System.out.println(count);
	}
	
	static boolean checkStr(String str) {
		boolean[] Alpha = new boolean[26];
		int pre = -1;
			
		for(int i=0; i < str.length(); i++) {
			int now = str.charAt(i);
			if(pre != now) {
				if(Alpha[now-97] == false) {
					Alpha[now-97] = true;
					pre = now;
				} else {
					return false;
				}
			} else {
				continue;
			}
		}
		return true;
	}
}
