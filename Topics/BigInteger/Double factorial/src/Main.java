import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        // type your java code here

        BigInteger answer = new BigInteger(String.valueOf(n));
        BigInteger power = new BigInteger(String.valueOf(n));

        if (n == 1 || n == 0) {
            answer = BigInteger.valueOf(1);
        } else if (n % 2 != 0) { // n is odd
            while (power.intValue() > 1) {
                power = power.subtract(BigInteger.valueOf(2));
                answer = answer.multiply(power);
            }
        } else {
            while (power.intValue() > 2) {
                power = power.subtract(BigInteger.valueOf(2));
                answer = answer.multiply(power);
            }
        }
        return answer;



        /*
                //7!! = 7*5*3*1
        // n!! = n * n-2 * n-4 * n-6
        // n!! = n * a
        // a -= 2

        // the following fails test #4
        //need special case of 1!!
        if (n == 1 || n == 0) {
            n = 1;
        } else if (n % 2 != 0) { // if its an odd number working
            while (a > 1) {
                a = a - 2;
                //System.out.println(a);
                n = n * a;
                //System.out.println(n);
            }
        } else { // if its an even number
            while (a > 2) {
                a = a - 2;
                //System.out.println(a);
                n = n * a;
            }
        }
        //System.out.println(n);
        */




    }
}