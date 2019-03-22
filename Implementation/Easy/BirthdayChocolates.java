import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BirthdayChocolates {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] s = new int[n];
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        for (int i=0;i<n;i++) {
            s[i] = Integer.parseInt(st.nextToken());
        }
        StringTokenizer st1 = new StringTokenizer(bufferedReader.readLine());
        int d = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        int count=0;
        for (int i=0;i<n;i++) {
            int sum=0;
            for (int j=0;j<m;j++) {
                if (i+j == n) {
                    break;
                }
                sum += s[i+j];
            }
            if (sum == d) {
                count++;
            }
        }
        System.out.println(count);
    }
}
