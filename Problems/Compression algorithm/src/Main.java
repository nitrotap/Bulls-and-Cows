import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // put your code here
        java.util.Scanner s = new java.util.Scanner(System.in);
        String input = s.nextLine();

        /* I chose to use ArrayList because it is easy to add an unknown set of
        items to the array.

        First, I read the input as a whole line.
        Second, I create an ArrayList, and to it, I add the place where it switches characters
        Third, I create an Arraylist, and set the count of each item in the previous arraylist
        Fourth, I create an Arraylist for the starting characters.
        Lastly, I use a for loop to put match the charArray with the countArray
         */
        ArrayList<Integer> splitIndexArray = new ArrayList<>();
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i + 1) != input.charAt(i)) {
                splitIndexArray.add(i + 1);
            }
        }
        splitIndexArray.add(input.length());
        //System.out.println(splitIndexArray.toString());
        ArrayList<String> letterArray = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            letterArray.add(input.substring(0, splitIndexArray.get(i)));
            for (int j = 0; j < splitIndexArray.size() - 1; j++) {
                letterArray.add(input.substring(splitIndexArray.get(j), splitIndexArray.get(j + 1)));
            }
            //System.out.println(letterArray.toString());
        }

        ArrayList<Integer> countArray = new ArrayList<>();
        for (String value : letterArray) {
            countArray.add(value.length());
        }
        //System.out.println(countArray.toString());

        ArrayList<Character> charArray = new ArrayList<>();
        for (String value : letterArray) {
            charArray.add(value.charAt(0));
        }
        //System.out.println(charArray.toString());

        for (int i = 0; i < letterArray.size(); i++) {
            System.out.print(charArray.get(i));
            System.out.print(countArray.get(i));
        }

    }
}

