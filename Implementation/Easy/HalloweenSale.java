import java.util.Scanner;

public class HalloweenSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int d = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int count=0;
        while (s>=p) {
            s = s-p;
            count++;
            p = Math.max(p-d, m);
        }
        System.out.println(count);
    }
}