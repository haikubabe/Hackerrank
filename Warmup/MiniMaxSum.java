import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MiniMaxSum {

    private static long findMin(long[] arr) {
        long min = arr[0];
        for (int i=1;i<arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    private static long findMax(long[] arr) {
        long max = arr[0];
        for (int i=1;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static long calculateSum(long[] arr) {
        long sum = 0;
        for (int i=0;i<arr.length;i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        long[] arr = new long[5];
        for (int i=0;i<5;i++) {
            arr[i] = Long.parseLong(stringTokenizer.nextToken());
        }
        long sum = calculateSum(arr);
        long max = findMax(arr);
        long min = findMin(arr);

        long minSum = sum-max;
        long maxSum = sum-min;

        System.out.println(minSum + " " + maxSum);
    }
}
