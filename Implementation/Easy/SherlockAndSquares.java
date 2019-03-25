package Implementation.Easy;
import java.util.Scanner;

public class SherlockAndSquares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t>0) {
            long a = scanner.nextInt();
            long b = scanner.nextInt();
            System.out.println((int)(Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1));
            t--;
        }
    }
}
