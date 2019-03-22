import java.util.Scanner;

public class ServiceLane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] w = new int[n];
        for (int i=0;i<n;i++) {
            w[i] = sc.nextInt();
        }
        while (t>0) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int min = w[i];
            for (int k=i;k<=j;k++) {
                if (w[k]<=min) {
                    min = w[k];
                }
            }
            System.out.println(min);
            t--;
        }
    }
}
