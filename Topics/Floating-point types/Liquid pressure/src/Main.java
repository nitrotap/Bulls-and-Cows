import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double density = scanner.nextDouble();
        double height = scanner.nextDouble();

        double pressure = 9.8 * density * height;

        System.out.println(pressure);
    }
}