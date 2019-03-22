import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakingTheRecords {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        for (int i=0;i<n;i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        int max=a[0], min=a[0];
        int bestScore=0, worstScore=0;
        for (int i=1;i<n;i++) {
            if (a[i]<min) {
                min = a[i];
                worstScore++;
            }
            if (a[i]>max) {
                max = a[i];
                bestScore++;
            }
        }
        System.out.println(bestScore + " " + worstScore);
    }
}
