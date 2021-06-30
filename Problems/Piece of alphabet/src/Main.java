class Main {
    public static void main(String[] args) {
        // put your code here
        java.util.Scanner s = new java.util.Scanner(System.in).useDelimiter("");
        String userInput = s.nextLine();
        boolean ordered = false;
        int orderCount = 0;

        for (int i = 0; i < userInput.length() - 1; i++) {
            //System.out.println(userInput.charAt(i) + 1);
            //System.out.println(userInput.charAt(i + 1) + 0);
            if (userInput.charAt(i) + 1 == userInput.charAt(i + 1)) {
                orderCount++;
            }
        }
        if (orderCount == userInput.length() - 1) {
            ordered = true;
        }
        System.out.println(ordered);
    }
}