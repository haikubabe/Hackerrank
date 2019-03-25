package Implementation.Easy;
import java.util.Scanner;

public class CircularArrayRotation {
    private static int findIndex(int k, int n) {
        while (k<=0) {
            k += n;
        }
        return k%n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int[] p = new int[1000001];
        for (int i=0;i<n;i++) {
            p[i] = a[findIndex(i+n-k, n)];
        }
        for (int i=0;i<q;i++) {
            int qu = sc.nextInt();
            System.out.println(p[qu]);
        }
    }
}
