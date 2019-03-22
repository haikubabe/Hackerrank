import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HurdleRace {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int h[] = new int[n];
        StringTokenizer st1 = new StringTokenizer(bufferedReader.readLine());
        int max=-1;
        for (int i=0;i<n;i++) {
            h[i] = Integer.parseInt(st1.nextToken());
            if (h[i]>max) {
                max = h[i];
            }
        }
        if (k<max) {
            System.out.println(max-k);
        } else {
            System.out.println(0);
        }
    }
}
