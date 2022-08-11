import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        while((str = br.readLine()) != null) {
            System.out.println(str);
        }

        // 출력을 위해서 다음과 같이 배열에 담기
        // StringBuilder 나 ArrayList
        StringBuilder builder = new StringBuilder();
        while(true){
            String str2 = br.readLine();
            if (str2==null || str2.isEmpty()) {
                break;
            }
            builder.append(str).append("\n");
        }
        br.close();
        System.out.println(builder);
    }
}
