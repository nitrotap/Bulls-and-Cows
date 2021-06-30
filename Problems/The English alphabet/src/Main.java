class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        // write your code here
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < 26; i++) {
            sb.append((char) ('A' + i));
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb;

    }

    public static void main(String[] args) {
        System.out.println(createEnglishAlphabet());
    }
}