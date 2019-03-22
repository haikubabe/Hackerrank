import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BirthdayCakeCandles {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        int[] arr = new int[n];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        int max=arr[0];
        for (int i=1;i<n;i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        int count = 0;
        for (int i=0;i<n;i++) {
            if (arr[i] == max) {
                count++;
            }
        }
        System.out.println(count);
    }
}
