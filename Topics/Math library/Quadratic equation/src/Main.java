import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        double quad = Math.sqrt(b * b - 4 * a * c);
        double x = (-b + quad) / (2 * a);
        double y = (-b - quad) / (2 * a);

        if (y > x) {
            System.out.println(x);
            System.out.println(y);
        } else {
            System.out.println(y);
            System.out.println(x);
        }
    }
}