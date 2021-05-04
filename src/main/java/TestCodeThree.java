import java.util.ArrayList;
import java.util.Scanner;

public class TestCodeThree {

    static ArrayList<Integer> arr = new ArrayList<Integer>();

    public static void main(String[] args) {
        arrayNumbersInput();
        aliquotNumsOutput();
    }

    public static void arrayNumbersInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите массив чисел через запятую: ");
        String str1 = scanner.nextLine();
        String[] parts = str1.split(", ");
        for (String part : parts) {
            arr.add(Integer.parseInt(part));
        }
    }

    public static void aliquotNumsOutput() {
        for (int i = 0; i <= arr.size() - 1; i++) {
            if (arr.get(i) % 3 == 0) {
                System.out.println("Число " + arr.get(i) + " кратное 3.");
            }
        }
    }
}
