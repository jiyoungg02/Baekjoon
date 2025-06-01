import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double result = 0, credit_sum = 0;
		
		for(int i=0; i<20; i++) {
			double credit = 0;
			double grade = 0;
			
			String[] str = br.readLine().split(" ");
			credit = Double.parseDouble(str[1]);
			char c = str[2].charAt(0);
			
			switch(c) {
			case 'A': if(str[2].charAt(1) == '+') grade += 4.5;
					  else grade += 4.0;
					  break;
			case 'B': if(str[2].charAt(1) == '+') grade += 3.5;
					  else grade += 3.0;
					  break;
			case 'C': if(str[2].charAt(1) == '+') grade += 2.5;
					  else grade += 2.0;
					  break;
			case 'D': if(str[2].charAt(1) == '+') grade += 1.5;
			  		  else grade += 1.0;
			  		  break;
			case 'F': grade += 0.0;
			  		  break;
			case 'P': grade += 0.0;
					  credit = 0.0;
	  		  		  break;	  
			}
			credit_sum += credit;
			result += credit * grade;
		}
		br.close();
		System.out.println(result/credit_sum);
	}
}
