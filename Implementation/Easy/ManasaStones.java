import java.util.Scanner;

public class ManasaStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int min = (n-1)*Math.min(a,b);
            System.out.print(min + " ");
            int max = (n-1)*Math.max(a,b);
            int sum=0;
            while ((sum+min)<max) {
                sum += Math.abs(a-b);
                System.out.print(sum+min + " ");
            }
            System.out.println();
            t--;
        }
    }
}
