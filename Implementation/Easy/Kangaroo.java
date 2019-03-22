import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Kangaroo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int x1 = Integer.parseInt(stringTokenizer.nextToken());
        int v1 = Integer.parseInt(stringTokenizer.nextToken());
        int x2 = Integer.parseInt(stringTokenizer.nextToken());
        int v2 = Integer.parseInt(stringTokenizer.nextToken());
        int x = x2-x1;
        int v = v1-v2;
        if (((x>0 && v>0) && (x%v==0)) || ((x<0 && v<0) && (x%v==0))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
