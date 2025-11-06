import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 1. 듣도 못한 사람을 Set에 저장 (존재 여부만 O(1)로 확인)
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        // 2. 듣보잡(결과)을 저장할 리스트
        List<String> list = new ArrayList<>();
        
        // 3. 보도 못한 사람을 읽으면서 Set에 존재하는지(듣도 못했는지) 확인
        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            
            if (set.contains(name)) {
                list.add(name); // 존재하면(듣보잡이면) 리스트에 추가
            }
        }

        // 4. 정렬
        Collections.sort(list);

        // 5. 출력
        StringBuilder sb = new StringBuilder();
        sb.append(list.size() + "\n");
        for (String s : list) {
            sb.append(s + "\n");
        }
        System.out.print(sb);
    }
}