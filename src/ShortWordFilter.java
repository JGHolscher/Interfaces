//done
public class ShortWordFilter implements Filter {
    //public static Filter accept;
    //implements the Filter interface

    public ShortWordFilter() {

    }
    @Override
    public boolean accept(Object x) {
        String word;
        //checking if x is a String
        if (x instanceof String) {
            word = (String) x;
            return word.length() < 5;

        }
            return false; //x is not a String
    }
}





    //implements the Filter interface
    // whose accept method
    // accepts all strings of length < 5.

