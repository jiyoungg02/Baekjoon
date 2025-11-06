import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=n; i++){
            queue.offer(i);
        }
        
        int count = 1;
        sb.append("<");
        while(queue.size() != 1){
            if (count == k) {
                sb.append(queue.poll() + ", ");
                count = 1;
            }
            else {
                queue.offer(queue.poll());
                count++;
            }
        }
        
        sb.append(queue.poll() + ">");
        System.out.println(sb);
    }
}