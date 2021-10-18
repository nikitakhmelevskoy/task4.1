import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        int n = readInt();
        double sum = sum(n);
        printResult(sum);
    }

    static int readInt() {
        System.out.print("Введите n = ");
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }

    static double sum(double n) {
        double sum = 0;
        int i;
        for (i = 1; i<=n; i++) {
            sum += 1/(Math.pow(i, 3));
        }
        return sum;
    }

    static void printResult(double sum) {
        System.out.println(sum);
    }
}