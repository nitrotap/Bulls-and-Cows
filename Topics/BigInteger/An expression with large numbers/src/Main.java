import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        final Scanner s = new Scanner(System.in);
        final String[] parts = s.nextLine().split("\\s+");

        BigInteger a = null;
        BigInteger b = null;
        BigInteger c = null;
        BigInteger d = null;
        BigInteger sum;

        try {
            a = new BigInteger(parts[0]);
            b = new BigInteger(parts[1]);
            c = new BigInteger(parts[2]);
            d = new BigInteger(parts[3]);
        } catch (Exception e) {
            System.out.println("Can't parse a big integer value");
            e.printStackTrace();
        }
        sum = a.abs().multiply(b).add(c).subtract(d);
        System.out.println(sum);
    }
}