import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int pagesFromFront = p/2;
        int pagesFromBack = n/2-p/2;
        if (pagesFromFront<pagesFromBack) {
            System.out.println(pagesFromFront);
        } else {
            System.out.println(pagesFromBack);
        }
    }
}
