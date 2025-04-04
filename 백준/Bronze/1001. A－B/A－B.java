import java.util.*;
/*
    입력받은 두 정수 합 출력하기
*/
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.printf("%d\n", a-b);
        sc.close();
    }
}