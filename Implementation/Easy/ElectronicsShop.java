import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ElectronicsShop {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(bufferedReader.readLine());
        int b = Integer.parseInt(st1.nextToken());
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        int[] k = new int[n];
        int[] u = new int[m];
        StringTokenizer st2 = new StringTokenizer(bufferedReader.readLine());
        for (int i=0;i<n;i++) {
            k[i] = Integer.parseInt(st2.nextToken());
        }
        StringTokenizer st3 = new StringTokenizer(bufferedReader.readLine());
        for (int i=0;i<m;i++) {
            u[i] = Integer.parseInt(st3.nextToken());
        }
        int max=-1;
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                int num = k[i] + u[j];
                if (num > max && num <= b) {
                    max = num;
                }
            }
        }
        System.out.println(max);
    }
}
