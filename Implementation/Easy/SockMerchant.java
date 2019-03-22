import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SockMerchant {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        int[] a = new int[n];
        int[] count = new int[101];
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        for (int i=0;i<n;i++) {
            a[i] = Integer.parseInt(st.nextToken());
            count[a[i]]++;
        }
        int num=0;
        for (int i=0;i<101;i++) {
            num += (count[i]/2);
        }
        System.out.println(num);
    }
}
