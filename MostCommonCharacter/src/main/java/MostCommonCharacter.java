import org.w3c.dom.css.Counter;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public int recurringChar(String str) {
        char maxappearchar = ' ';
        int counter = 0;
        int [] charcnt = new int[Character.MAX_VALUE + 1];
        for (int i = 0; i<str.length() ; i++){
            char ch = str.charAt(i);
            charcnt[ch]++ ;
            if (charcnt[ch] > counter)
        {
           counter = charcnt[ch];
           maxappearchar = ch;
        }
    }
        return maxappearchar;
}
}