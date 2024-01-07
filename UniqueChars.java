/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String ans = "" + s.charAt(0);
        char curChr;
        
        for (int i = 1; i < s.length(); i++) {
            curChr = s.charAt(i);
            if (curChr != ' ') {
                if (ans.indexOf(curChr) == -1)
                ans += curChr;
            }
            else 
                ans += curChr;  
        }

        return ans;
    }
}