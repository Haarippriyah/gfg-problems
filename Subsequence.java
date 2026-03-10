class Subsequence{

    public static boolean isSubsequence(String s, String t) {
        int i = 0; 
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; 
            }
            j++; 
        }

        return i == s.length();
    }

    public static void main(String[] args) {
        String s1 = "ace";
        String t1 = "abcde";
        System.out.println(isSubsequence(s1, t1)); // true

        String s2 = "aec";
        String t2 = "abcde";
        System.out.println(isSubsequence(s2, t2)); // false
    }
}