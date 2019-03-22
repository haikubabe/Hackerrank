import java.util.Scanner;

public class ChocolateFeast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();
            int chocolates = n/c;
            int wrappers = chocolates;
            if (wrappers == m) {
                chocolates++;
            } else if (wrappers > m) {
                while (wrappers >= m) {
                    chocolates++;
                    wrappers = (wrappers-m)+1;
                }
            }
            System.out.println(chocolates);
            t--;
        }
    }
}