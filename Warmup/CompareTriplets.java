import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CompareTriplets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str1 = new StringTokenizer(bufferedReader.readLine());
        int[] a = new int[3];
        for (int i=0;i<3;i++) {
            a[i] = Integer.parseInt(str1.nextToken());
        }
        StringTokenizer str2 = new StringTokenizer(bufferedReader.readLine());
        int[] b = new int[3];
        for (int i=0;i<3;i++) {
            b[i] = Integer.parseInt(str2.nextToken());
        }
        int aliceCount = 0, bobCount = 0;
        for (int i=0;i<3;i++) {
            if (a[i] > b[i]) {
                aliceCount++;
            } else if (b[i] > a[i]) {
                bobCount++;
            }
        }
        System.out.println(aliceCount + " " + bobCount);
    }
}
