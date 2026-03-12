import java.util.*;

public class Appendchar{
    
    public static int appendCharacters(String s, String t) {
        int i = 0, j = 0;
        int n = s.length(), m = t.length();
        
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }
        
        return m - j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String t = sc.next();
        
        int result = appendCharacters(s, t);
        System.out.println(result);
    }
}