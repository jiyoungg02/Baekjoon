import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 1;
        
        if(N == 1){
            System.out.println(1);
        }
        else {
            while(true) {
                range = range + 6 * count;
                if(N <= range){
                    System.out.println(count + 1);
                    break;
                } else {
                    count++;
                }
            }
        } 
        
    }
}