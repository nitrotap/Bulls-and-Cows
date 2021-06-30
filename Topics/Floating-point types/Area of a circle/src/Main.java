import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double radius = scanner.nextDouble();
        double area = radius * radius * Math.PI;
        System.out.println(area);
    }
}