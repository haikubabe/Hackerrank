import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int space = n-1;
        int i=0;
        while (space >= 0) {
            for (i=0;i<space;i++) {
                System.out.print(" ");
            }
            for (int j=i;j<n;j++) {
                System.out.print("#");
            }
            System.out.println();
            space--;
        }
    }
}
