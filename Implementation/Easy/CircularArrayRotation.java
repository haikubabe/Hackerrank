import java.util.Scanner;

public class CircularArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int q = scanner.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) {
            a[i] = scanner.nextInt();
        }
        for (int i=0;i<q;i++) {
            int qu = scanner.nextInt();
            int rem = k%n;
            if (qu-rem>=0) {
                System.out.println(a[qu-rem]);
            } else {
                System.out.println(a[qu-rem+a.length]);
            }
        }
    }
}
