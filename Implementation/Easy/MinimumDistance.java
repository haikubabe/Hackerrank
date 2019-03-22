import java.util.Scanner;

public class MinimumDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int min=n;
        for (int i=0;i<n-1;i++) {
            for (int j=i+1;j<n;j++) {
                if (a[i] == a[j]) {
                    if (min>Math.abs(i-j)) {
                        min = Math.abs(i-j);
                        break;
                    }
                }
            }
        }
        if (min == n) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }
}
