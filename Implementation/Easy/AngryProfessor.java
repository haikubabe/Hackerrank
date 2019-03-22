import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AngryProfessor {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        while (t>0) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] a = new int[n];
            StringTokenizer st1 = new StringTokenizer(bufferedReader.readLine());
            int arriveOnTime = 0;
            for (int i=0;i<n;i++) {
                a[i] = Integer.parseInt(st1.nextToken());
                if (a[i]<=0) {
                    arriveOnTime++;
                }
            }
            if (arriveOnTime<k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
}
