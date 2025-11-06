import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0; i<T; i++){
            sb.append(slove(br.readLine())).append("\n");
        }
        
        System.out.println(sb);
    }
    
    public static String slove(String s){
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            // 여는 괄호일 경우 push
            if(c == '('){
                stack.push(c);
            }
            // 닫는 괄호이나 stack 비었을 때(닫는괄호가 더 많을 때)
            else if(stack.empty()){
                return "NO";
            }
            else{
                stack.pop();
            }
        }
        
        // 결과 리턴
        if(stack.empty()){
            return "YES";
        }else {
            return "NO";
        }
    }
}