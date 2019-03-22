import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SaveThePrisoner {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        while (t>0) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            long s = Long.parseLong(st.nextToken());
            if ((m+s-1)%n == 0) {
                System.out.println(n);
            } else {
                System.out.println((m+s-1)%n);
            }
            t--;
        }
    }
}
