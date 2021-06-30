import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // put your code here
        java.util.Scanner s = new java.util.Scanner(System.in);
        String userInput = s.nextLine();
        // System.out.println(userInput);

        // let's first parse the parameters
        // first, i need an index for the separators - looking at the inputs, it looks like the end of the
        // key will be &
        ArrayList<Integer> ampIndex = new ArrayList<>();
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == '&') {
                ampIndex.add(i);
            }
        }
        System.out.println(ampIndex.toString()); // prints out locations of ampersands

        // just answer the question, is there a pass in the url?
        boolean passCheck = userInput.contains("pass");
        // parse the password if there, otherwise mark pass as not found
        String pass = "";
        if (passCheck) {
            try {
                pass = userInput.substring((userInput.indexOf("pass") + 5), ampIndex.get(0));
            } catch (Exception e) {
                System.out.println("Error: Please try again!");
            }
        } else {
            pass = "not found";
        }
        //System.out.println(pass);
        // use very similar setup for cookie and host
        // any differences? dont see any
        //todo ampersands are incorrect - they are hard coded. i need a different
        // way of find the end of value
        boolean cookieCheck = userInput.contains("cookie");
        String cookie = "";
        if (cookieCheck) {
            try {
                cookie = userInput.substring((userInput.indexOf("cookie") + 6), (ampIndex.get(1) - 1));
            } catch (Exception e) {
                cookie = "not found";
            }
        } else {
            cookie = "not found";
        }
        if ("".equals(cookie)) {
            cookie = "not found";
        }
        System.out.println(cookie);



        var test = userInput.split("&");
        System.out.println(Arrays.toString(test));
        //userInput.split works pretty well actually
        //



















        /*
        // let's get the pass / password
        try {
            String pass = userInput.substring((userInput.indexOf("pass") + 5), ampIndex.get(0));
        } catch (Exception e) {
            System.out.println("Please enter a ")
        }
        // how will we know if it is found?
        // if its size is greater than 0
        // is pass found or not found?
        boolean passCheck = userInput.contains("pass") && pass.length() != 0;
        if (!passCheck) {
            pass = "not found";
        }
        System.out.println("pass : " + pass);

        */













        /*
        // maybe use .includes() for the string
        // i need to find the spot to start the slice
        // well, it could just always be 5 spot after the start
        // then, maybe slice

        boolean portTest = userInput.contains("port");
        boolean cookieTest = userInput.contains("cookie");
        boolean hostTest = userInput.contains("host");
        boolean pwTest = userInput.contains("password");

        int startIndex = userInput.indexOf("pass");
        int endIndex = startIndex + 5;
        System.out.println(passTest);
        System.out.println(startIndex);
        System.out.println(endIndex);




        if (passTest == true) {
            String pass = userInput.substring((userInput.indexOf("pass") + 5), ampIndex.get(0));
        } else {
        }
        if (portTest == true) {
            String port = userInput.substring((userInput.indexOf("port") + 5),ampIndex.get(1));
            System.out.println("port : " + port);
        } else {
            System.out.println("port : not found");
        }
        if (cookieTest == true) {
            String cookie = userInput.substring((userInput.indexOf("cookie") + 6),(ampIndex.get(2) - 1));
            System.out.println("cookie : " + cookie);
        } else {
            System.out.println("cookie : not found");

        }
        if (hostTest == true) {
            String host = userInput.substring((userInput.indexOf("host") + 5), (userInput.length()));
            System.out.println("host : " + host);
        } else {
            System.out.println("host : not found");

        }
        if (passTest == true) {
            String pass = userInput.substring((userInput.indexOf("pass") + 5), ampIndex.get(0));
            System.out.println("password : " + pass);
        } else {
            System.out.println("pass : not found");

        }*/



    }
}