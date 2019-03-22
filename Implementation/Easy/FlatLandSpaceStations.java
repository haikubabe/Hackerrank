import java.util.Scanner;

public class FlatLandSpaceStations {
    private static int findMinDistance(int index, int[] s, int m) {
        int min = Math.abs(index-s[0]);
        for (int i=1;i<m;i++) {
            int dist = Math.abs(index-s[i]);
            if (dist < min) {
                min = dist;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] s = new int[m];
        for (int i=0;i<m;i++) {
            s[i] = sc.nextInt();
        }
        int minDist = 0, max = 0;
        for (int i=0;i<n;i++) {
            minDist = findMinDistance(i, s, m);
            if (minDist > max) {
                max = minDist;
            }
        }
        System.out.println(max);
    }
}