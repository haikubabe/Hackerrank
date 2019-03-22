import java.util.Scanner;

public class EqualizeTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] count = new int[101];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            count[arr[i]]++;
        }
        int max=count[0];
        for (int i=0;i<101;i++) {
            if (count[i]>max) {
                max = count[i];
            }
        }
        if (max == 1) {
            System.out.println(n-1);
        } else {
            System.out.println(n-max);
        }
    }
}
