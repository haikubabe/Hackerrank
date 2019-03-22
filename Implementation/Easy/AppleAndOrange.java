import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AppleAndOrange {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(bufferedReader.readLine());
        int s = Integer.parseInt(st1.nextToken());
        int t = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(bufferedReader.readLine());
        int a = Integer.parseInt(st2.nextToken());
        int b = Integer.parseInt(st2.nextToken());
        StringTokenizer st3 = new StringTokenizer(bufferedReader.readLine());
        int m = Integer.parseInt(st3.nextToken());
        int n = Integer.parseInt(st3.nextToken());
        int[] apple = new int[m];
        int[] orange = new int[n];
        StringTokenizer st4 = new StringTokenizer(bufferedReader.readLine());
        for (int i=0;i<m;i++) {
            apple[i] = Integer.parseInt(st4.nextToken());
        }
        StringTokenizer st5 = new StringTokenizer(bufferedReader.readLine());
        for (int i=0;i<n;i++) {
            orange[i] = Integer.parseInt(st5.nextToken());
        }
        int countA = 0, countB = 0;
        for (int i=0;i<m;i++) {
            int dist = a + apple[i];
            if (dist >= s && dist <= t) {
                countA++;
            }
        }
        for (int i=0;i<n;i++) {
            int dist = b + orange[i];
            if (dist >= s && dist <= t) {
                countB++;
            }
        }
        System.out.println(countA);
        System.out.println(countB);
    }
}
