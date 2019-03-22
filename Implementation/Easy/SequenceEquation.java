import java.util.Scanner;

public class SequenceEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n];
        for (int i=0;i<n;i++) {
            p[i] = scanner.nextInt();
        }
        int x=1,index,y;
        for (int i=0;i<n&&x<=n;i++) {
            if (x == p[i]) {
                index = i+1;
                for (int j=0;j<n;j++) {
                    if (index == p[j]) {
                        y=j+1;
                        System.out.println(y);
                        x++;
                        i=-1;
                        break;
                    }
                }
            }
        }
    }
}
