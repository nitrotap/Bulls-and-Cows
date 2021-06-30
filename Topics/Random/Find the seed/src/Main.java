import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        /*
        seed is between A and B
        seed produces N numbers from 0 to K
        maxOf N numbers == minOf(maxArray) where maxArray is max of all other seeds

        what are the components?
        A B N K and the seed
        K is the upper bound
        N is the number of times you run the loop
        a through b are...
        Random rng = new Random(A through B);
         */
        /*
        seed is somewhere between the first two numbers
        N = 4 / range is from 0 to K(aka 100)
        so the question is which seed is being used? maybe?
        to find the seed, take the maximum of a sequence

        "then the minimum of the maximums is 64." <- lol what is this?
        Maybe the minimum of the maximums is the seed?
        the minimum of the maximum should be divisible by the seed?
        output the seed and its max

        so really, im running sequences of a seed
        finding their maximums
        finding the minimum of those maximums
        then referencing the minimum with which seed it came from
        then outputting the seed and its max
         */

        /* sample input 0 / 100 / 5 / 1000
        from 0 to 1000, random.nextInt(100)
        run that 5 times, store the maximum in an array (using iteration count as element#)
        find the minimum in the maximum array
        match the iteration count
        print minimum and iteration count
         */
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        ArrayList<Integer> maxArray = new ArrayList<>();
        for (int j = A; j <= B; j++) {
            Random rng = new Random(j);
            ArrayList<Integer> numArray = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                numArray.add(rng.nextInt(K));
            }
            // now i need to find the maximum of the numArray
            int max = 0;
            max = Math.max(numArray.get(0), numArray.get(1));
            for (Integer integer : numArray) {
                max = Math.max(max, integer);
            }
            maxArray.add(max);
        }
        // now i have an array of maximums
        // now i need the minimum of that array and its iteration
        int min = 0;
        min = Math.min(maxArray.get(0), maxArray.get(1));
        for (int i = 1; i < maxArray.size() - 1; i++) {
            min = Math.min(min, maxArray.get(i));
        }
        // need to match the min with its index
        int iterationCount = 0;
        for (int i = maxArray.size() - 1; i >= 0; i--) {
            if (maxArray.get(i) == min) {
                iterationCount = i;
            }
        }
        System.out.println(iterationCount + A);
        System.out.println(maxArray.get(iterationCount));
    }
}