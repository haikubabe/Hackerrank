import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t>0) {
            int n = scanner.nextInt();
            int[] cycles = new int[61];
            cycles[0] = 1;
            for (int i=1;i<61;i++) {
                if (i%2==1) {
                    cycles[i] = 2 * cycles[i-1];
                } else {
                    cycles[i] = cycles[i-1] + 1;
                }
            }
            System.out.println(cycles[n]);
            t--;
        }
    }
}
