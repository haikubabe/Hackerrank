package Implementation.Easy;
import java.util.Scanner;

public class CutTheSticks {
    private static int min(int[] arr) {
        int min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++) {
            if (arr[i]!=0 && arr[i]<min) {
                min=arr[i];
            }
        }
        return min;
    }

    private static int length(int[] arr) {
        int len=0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] != 0) {
                len++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
        }
        int sticksCut = 0;
        int lengthOfCut = min(arr);
        while (sticksCut >= 0 && lengthOfCut != Integer.MAX_VALUE) {
            sticksCut = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] >= lengthOfCut) {
                    arr[i] = arr[i] - lengthOfCut;
                    sticksCut++;
                }
            }
            System.out.println(sticksCut);
            lengthOfCut = min(arr);
        }
    }
}
