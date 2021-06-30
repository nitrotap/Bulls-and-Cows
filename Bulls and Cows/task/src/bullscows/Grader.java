package bullscows;

import java.util.ArrayList;

public class Grader {
    public static void grader(String[] args) {
        /*
        Objective 1: input a 4 digit number
        Objective 2: using a pre-defined code, grade the input digit by digit
        correctly guessed is cow
        correctly guessed with correct position is bull
         */

        // objective 1
        java.util.Scanner s = new java.util.Scanner(System.in);
        String userInput = s.next();

        // objective 2

        // put individual characters into an array
        ArrayList<Character> inputArray = new ArrayList<>();
        for (int i = 0; i < userInput.length(); i++) {
            inputArray.add(userInput.charAt(i));
        }
        //System.out.println(inputArray.toString());

        // maybe i can set it up so it checks for a bull first
        // if its a bull, then continue to next integer
        // if its not a bull, then is it a cow? then go on to next integer
        // maybe i can make a status array - if its a bull then true
        int cowCount = 0;
        int bullCount = 0;

        ArrayList<Boolean> statusArray = new ArrayList<>();

        // bullcount has to be hard coded
        if (inputArray.get(0) == '9') {
            bullCount++;
            statusArray.add(true);
        } else {
            statusArray.add(false);
        }
        if (inputArray.get(1) == '3') {
            bullCount++;
            statusArray.add(true);
        } else {
            statusArray.add(false);
        }
        if (inputArray.get(2) == '0') {
            bullCount++;
            statusArray.add(true);
        } else {
            statusArray.add(false);
        }
        if (inputArray.get(3) == '5') {
            bullCount++;
            statusArray.add(true);
        } else {
            statusArray.add(false);
        }
        //System.out.println(statusArray.toString());

        /*
        so now, cow counter
        if statusArray.get(i) == false, then
        search for input.get(i) within the array
        if it is located, then add to cow counter
         */

        for (int i = 0; i < statusArray.size(); i++) {
            if (statusArray.get(i) == false) {
                if (inputArray.get(i) == '9') {
                    cowCount++;
                }
                if (inputArray.get(i) == '3') {
                    cowCount++;
                }
                if (inputArray.get(i) == '0') {
                    cowCount++;
                }
                if (inputArray.get(i) == '5') {
                    cowCount++;
                }
            }
        }

        /*
        need multiple printouts
        1. if bullCount and cowCount == 0
        2. if bullCount = 0 and cowCount > 0
        3. if bullcount and cowCount are both > 0
         */

        if (bullCount == 0 && cowCount == 0) {
            System.out.println("Grade: None. The secret code is 9305.");
        } else if (bullCount == 0 && cowCount > 0) {
            System.out.println("Grade: " + cowCount + " cow(s). The secret code is 9305.");
        } else if (bullCount > 0 && cowCount == 0) {
            System.out.println("Grade: " + bullCount + " bull(s). The secret code is 9305.");
        } else {
            System.out.println("Grade: " + bullCount + " bull(s) and " + cowCount + " cows(s). The secret code is 9305.");
        }
    }
}

