//done
public class ShortWordFilter implements Filter {
    //implements the Filter interface

    /*
       @Override//accepts all strings of length < 5.
       public boolean accept(Object obj) {
           String word = (String) obj;
           return word.length() < 5;

       }
   */
    private String word;

    public ShortWordFilter(String word) {
        this.word = word;
    }

    @Override
    public boolean accept(Object x) {
        //checking if x is a String
        if (x instanceof String) {
            String word = (String) x;
            return word.length() < 5;
        }
        return false; //x is not a String
    }
}





    //implements the Filter interface
    // whose accept method
    // accepts all strings of length < 5.

