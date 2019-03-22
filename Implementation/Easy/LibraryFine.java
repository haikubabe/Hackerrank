import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        int d2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if (y1 < y2) {
            System.out.println(0);
        } else if (y1 == y2) {
            if (m1 < m2) {
                System.out.println(0);
            } else if (m1 == m2) {
                if (d1 <= d2) {
                    System.out.println(0);
                } else {
                    System.out.println(15 * (d1-d2));
                }
            } else {
                System.out.println(500 * (m1-m2));
            }
        } else {
            System.out.println(10000);
        }

    }
}
