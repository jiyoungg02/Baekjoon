import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			sum += dial(str.charAt(i));
		}
		System.out.println(sum);
	}
	
    public static int dial(int ASCII) {
        if(ASCII >= 'A' && ASCII <= 'C') return 3;
        else if(ASCII <= 'F') return 4;
        else if(ASCII <= 'I') return 5;
        else if(ASCII <= 'L') return 6;
        else if(ASCII <= 'O') return 7;
        else if(ASCII <= 'S') return 8;
        else if(ASCII <= 'V') return 9;
        else if(ASCII <= 'Z') return 10;

        return 0;
    }
}