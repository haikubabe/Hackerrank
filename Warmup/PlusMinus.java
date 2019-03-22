import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        int[] arr = new int[n];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        double countP=0, countN=0, countZ=0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i]>0) {
                countP++;
            } else if (arr[i]==0) {
                countZ++;
            } else {
                countN++;
            }
        }
        System.out.printf("%.6f\n", countP/n);
        System.out.printf("%.6f\n", countN/n);
        System.out.printf("%.6f\n", countZ/n);
    }
}
