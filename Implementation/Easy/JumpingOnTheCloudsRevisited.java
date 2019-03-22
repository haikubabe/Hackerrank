import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] c = new int[n];
        for (int i=0;i<n;i++) {
            c[i] = scanner.nextInt();
        }
        int e=100,index=0;
        index = (index+k)%n;
        e = e - 2 * c[index] - 1;
        while (index!=0) {
            index = (index+k)%n;
            e = e - 2 * c[index] - 1;
        }
        System.out.println(e);
    }
}
