import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите два числа m и n");
        Scanner sc = new Scanner(System.in);
        int m = 0, n ;
        if (sc.hasNextInt()) {
            m = sc.nextInt();
            n = sc.nextInt();
            System.out.println(" m больше n");
            if (m > n) System.out.println("true");
            else System.out.println("false");
        }
    }
}
