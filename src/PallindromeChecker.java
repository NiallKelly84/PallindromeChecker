/**
 * Created by eniakel on 07/08/2015.
 */
public class PallindromeChecker {
    public static void main (String args[]) {
        PallindromeChecker p = new PallindromeChecker();
        boolean first = p.isPallindromeMethod1("Niall");
        System.out.println(first);
        boolean second = p.isPallindromeMethod1("NAVAAVAN");
        System.out.println(second);

        boolean third = p.isPallindromeMethod2("Niall");
        System.out.println(third);
        boolean fourth = p.isPallindromeMethod2("NAVAAVAN");
        System.out.println(fourth);

        boolean fifth = p.isPallindromeMethod3("Niall");
        System.out.println(fifth);
        boolean sixth = p.isPallindromeMethod3("NAVAAVAN");
        System.out.println(sixth);
    }

    public boolean isPallindromeMethod1(String word) {
        //using Java API
        StringBuilder sb = new StringBuilder();
        sb.append(word);
        if (word.equals(sb.reverse().toString())){
            return true;
        }
        return false;
    }

    public boolean isPallindromeMethod2(String word) {
        //using loops
        char[] charArray = word.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = charArray.length-1; i>=0; i--) {
            sb.append(charArray[i]);
        }
        if (word.equals(sb.toString())){
            return true;
        }
        return false;
    }

    public boolean isPallindromeMethod3(String word) {
        //using recursion
        if (word.length() == 0 || word.length() == 1) {
            return true;
        }
        if (word.charAt(0) == word.charAt(word.length()-1)) {
            return isPallindromeMethod3(word.substring(1, word.length()-1));
        }
        return false;
    }
}
