import java.util.Scanner;

public class TestCodeOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число больше 7: ");
        long num = scanner.nextLong();
        if (num > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("Вы ввели число меньше 7.");
        }
    }
}
