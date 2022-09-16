//done
public class ShortWordFilter implements Filter{//implements the Filter interface

   // public static boolean accept = true;//?
    //public static boolean accept;
    private String word;
    public ShortWordFilter(String word) {
        this.word = word;
    }

    @Override//accepts all strings of length < 5.
    public boolean accept(Object obj) {
        String word = (String) obj;
        return word.length() < 5;

    }



    //implements the Filter interface
    // whose accept method
    // accepts all strings of length < 5.
}
