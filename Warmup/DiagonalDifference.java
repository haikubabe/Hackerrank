import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DiagonalDifference {
    private static int leftToRightDiagonalSum(int[][] a, int n) {
        int sum=0;
        for (int i=0;i<n;i++) {
            sum += a[i][i];
        }
        return sum;
    }

    private static int rightToLeftDiagonalSum(int[][] a, int n) {
        int sum=0;
        for (int i=0;i<n;i++) {
            sum += a[i][n-i-1];
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().split("\\s+")[0]);
        int[][] a = new int[n][n];
        for (int i=0;i<n;i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j=0;j<n;j++) {
                a[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        int diagonalLeft = leftToRightDiagonalSum(a,n);
        int diagonalRight = rightToLeftDiagonalSum(a,n);
        int diff = diagonalLeft-diagonalRight;

        if (diff < 0) {
            System.out.println(diagonalRight-diagonalLeft);
        } else {
            System.out.println(diff);
        }
    }
}
