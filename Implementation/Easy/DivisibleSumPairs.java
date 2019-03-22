import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DivisibleSumPairs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        StringTokenizer st1 = new StringTokenizer(bufferedReader.readLine());
        for (int i=0;i<n;i++) {
            a[i] = Integer.parseInt(st1.nextToken());
        }
        int count = 0;
        for (int i=0;i<n-1;i++) {
            for (int j=i+1;j<n;j++) {
                if ((a[i]+a[j])%k == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
