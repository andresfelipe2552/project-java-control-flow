import java.util.Scanner;

public class WeatherAdvisor {

    // Método que devuelve la cadena FizzBuzzBoom según el número
    public static String getFizzBuzzString(int n) {
        String result = "";

        if (n % 3 == 0) result += "Fizz";
        if (n % 5 == 0) result += "Buzz";
        if (n % 7 == 0) result += "Boom";

        return result.isEmpty() ? String.valueOf(n) : result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        System.out.println("\n--- FizzBuzzBoom Results ---");
        for (int i = start; i <= end; i++) {
            System.out.println(getFizzBuzzString(i));
        }

        scanner.close();
    }
}
