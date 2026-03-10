class ScoreOfStr {

    static int scoreOfString(String s) {

        int score = 0;

        for (int i = 1; i < s.length(); i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }

        return score;
    }

    public static void main(String[] args) {

        String s = "hello";
        System.out.println(scoreOfString(s));  
    }
}