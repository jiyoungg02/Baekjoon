import java.util.*;
/*
입력 받은 두 정수 나눗셈 결과 출력
*/
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.print("");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a/b);
        sc.close();
    }
}

