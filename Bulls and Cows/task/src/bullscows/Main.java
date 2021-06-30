package bullscows;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input the length of the secret code:");
        int codeLength = 0;
        try {
            codeLength = s.nextInt();
        } catch (Exception e) {
            System.out.println("Error");
            System.exit(0);
        }
        if (codeLength < 1 || codeLength > 36) {
            System.out.println("Error: code length limit is 1 to 36");
            System.exit(0);
            //main(args);
        }
        System.out.println("Input the number of possible symbols in the code:");
        int symbolLength;
        symbolLength= s.nextInt();
        if (symbolLength < codeLength || symbolLength > 36) {
            System.out.println("Error: symbol length must be " + codeLength + " to 36");
            System.exit(0);
            //main(args);
        }
        String secretCode;
        secretCode = secretCodeGenerator(codeLength, symbolLength).toString();

        StringBuilder asteriskString = new StringBuilder();
        for (int i = 0; i < codeLength; i++) {
            asteriskString.append("*");
        }
        if (symbolLength < 11) {
            System.out.println("The secret code is prepared: " + asteriskString + " (" + "0-" + (symbolLength - 1) + ")");
        } else {
            System.out.println("The secret code is prepared: " + asteriskString + " (" + "0-9, a-" + ((char) (symbolLength + 86)) + ")");
        }
        System.out.println("Okay, let's start a game!");
        for (int i = 1; ; i++) {
            int turnCount = i;
            System.out.println("Turn " + turnCount + ":");
            String guess = s.next();
            String grade = grader(guess, secretCode);
            System.out.println("Grade: " + grade);
            if (grade.contains("Congratulations")) {
                break;
            }
        }
    }

    public static String grader(String guess, String secretCode) {
        ArrayList<Character> guessArray = new ArrayList<>();
        for (int i = 0; i < guess.length(); i++) {
            guessArray.add(guess.charAt(i));
        }
        int cowCount = 0;
        int bullCount = 0;
        // bull counter
        ArrayList<Boolean> statusArray = new ArrayList<>();
        for (int i = 0; i < guess.length(); i++) {
            if (guessArray.get(i) == secretCode.charAt(i)) {
                bullCount++;
                statusArray.add(true);
            } else {
                statusArray.add(false);
            }
        }
        // cow counter
        for (int i = 0; i < statusArray.size(); i++) {
            if (!statusArray.get(i)) { // for every false in statusArray
                for (int j = 0; j < secretCode.length(); j++) { // for every element in guessArray
                    if (guessArray.get(j).equals(secretCode.charAt(j))) { // if guessArray(i) =
                        cowCount++;
                    }
                }
            }
        }
        // subtract bullcount from cowcount
        cowCount = cowCount - bullCount;
        if (cowCount < 0) {
            cowCount = 0;
        }
        if (bullCount == secretCode.length()) {
            return bullCount + " bulls" + "\nCongratulations! You guessed the secret code.";
        } else if (bullCount > 0 && cowCount > 0) {
            return bullCount+ " bulls and " + cowCount + " cows";
        } else if (bullCount == 0 && cowCount > 0) {
            return cowCount + " cows";
        } else if (bullCount > 0 && cowCount == 0) {
            return bullCount + " bulls";
        } else {
            return "None";
        }
    }

    public static char randomGenerator (int symbolLength) {
        Random rng = new Random();
        int randInt;
        char randChar;
        randInt = rng.nextInt(symbolLength); // prints 0 to 35
        if (randInt < 10) {
            randChar = (char) (randInt + 48);
        } else {
            randChar = (char) ('a' + randInt - 10);
        }
        return randChar;
    }

    public static StringBuilder secretCodeGenerator (int codeLength, int symbolLength) {
        ArrayList<Character> charCode = new ArrayList<>();
        for (int i = 0; i < codeLength; i++) {
            char tempChar = randomGenerator(symbolLength);
            while (charCode.contains(tempChar)) {
                tempChar = randomGenerator(symbolLength);
            }
            charCode.add(tempChar);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charCode.size(); i++) {
            sb.append(charCode.get(i));
        }
        return sb;
    }
}