package bullscows;
import java.util.Random;
import java.util.Scanner;

public class rng {
    public static void rng(String[] args) {
    /*
    this is a program to create random numbers
     */
        Random rng = new Random();
        // obtaining a single random number from 0 to 10
        System.out.println(rng.nextInt(10));

        // obtaining random numbers in a set interval
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter upper and lower bound");
        System.out.println("upper");
        int upper = s.nextInt();
        System.out.println("lower");
        int lower = s.nextInt();

        // the below code is how the interval works
        // basically taking the number it produces, then adding the lower bound to the rng(interval length + 1)
        // and adding the lower bound to it
        // int next = rng.nextInt(upper - lower + 1) + lower;

        int intervalLength = upper - lower + 1;

        for (int i = 0; i < 5; i++) {
            System.out.println(rng.nextInt(intervalLength) + lower);
        }



    }
}