import java.util.Scanner;

public class ViralAdvertising {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int shared = 5;
        int like = shared/2;
        int cumulative = like;
        for (int i=2;i<=n;i++) {
            shared = 3*like;
            like = shared/2;
            cumulative += like;
        }
        System.out.println(cumulative);
    }
}
