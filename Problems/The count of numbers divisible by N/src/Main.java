class Main {
    public static void main(String[] args) {
        // put your code here
        java.util.Scanner s = new java.util.Scanner(System.in);

        int count = 0;
        int a = s.nextInt();
        int b = s.nextInt();
        int n = s.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}