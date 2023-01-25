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
        int i=0;
        char first = 0;
        char second = 0;
        int[] count;
       for(i=0; i < str.length(); i++);
        (count[str.length()])++;
        for(i=0; i < str.length(); i++){
           if(count[i] > count[i]){
            second = first;
            first = i;
           }
           else if (count[i] > count[second] && count[i] != count[first])
           second = i;
    }
     return first;
}
}