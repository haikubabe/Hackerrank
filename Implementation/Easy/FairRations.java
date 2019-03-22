import java.util.Scanner;

public class FairRations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i=0;i<n;i++) {
            b[i] = sc.nextInt();
        }
        int minLoaves=0;
        for (int i=0;i<n-1;i++) {
            if (b[i]%2 == 1) {
                b[i]++;
                b[i+1]++;
                minLoaves += 2;
            }
        }
        boolean canDistribute=true;
        for (int i=0;i<n;i++) {
            if (b[i]%2==1) {
                canDistribute=false;
                break;
            }
        }
        if (canDistribute) {
            System.out.println(minLoaves);
        } else {
            System.out.println("NO");
        }
    }
}
