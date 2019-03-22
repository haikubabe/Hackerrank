import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MigratoryBirds {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        int[] count = new int[6];
        for (int i=0;i<n;i++) {
            a[i] = Integer.parseInt(st.nextToken());
            count[a[i]]++;
        }
        int min = 0, max=count[0];
        for (int i=0;i<6;i++) {
            if ((count[i]>max)) {
               max = count[i];
               min = i;
            }
        }
        System.out.println(min);
    }
}
