import java.util.Scanner;

public class DayOfTheProgrammer {
    private static boolean isLeapYear(int year) {
        if (year >= 1700 && year <= 1917) {
            return (year%4==0);
        } else {
            return  ((year%4==0 && year%100!=0) || (year%400==0));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean leapYear = isLeapYear(year);
        if (leapYear) {
            System.out.println("12.09." + year);
        } else {
            if (year == 1918) {
                System.out.println("26.09." + year);
            } else {
                System.out.println("13.09." + year);
            }
        }
    }
}
