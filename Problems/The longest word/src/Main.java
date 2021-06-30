class Main {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in).useDelimiter(" ");
        String userInput = s.nextLine();
        String[] parse = userInput.split(" ");
        int[] count = new int[parse.length];
        for (int i = 0; i < parse.length; i++) {
            count[i] = parse[i].length();
        }
        int highCountIndex = 0;
        int highCount = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > highCount) {
                highCount = count[i];
                highCountIndex = i;

            }
        }
        System.out.println(parse[highCountIndex]);
    }
}