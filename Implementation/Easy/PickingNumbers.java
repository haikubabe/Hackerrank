import java.util.Scanner;

public class PickingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[100];
        for (int i=0;i<n;i++) {
            int num = sc.nextInt();
            count[num]++;
        }
        int max=0;
        for (int i=0;i<99;i++) {
            if (count[i]+count[i+1] > max) {
                max = count[i]+count[i+1];
            }
        }
        System.out.println(max);
    }
}
