public class ShortWordFilter implements Filter{



    @Override
    public boolean accept(Object x) {
        return false;
    }
    //implements the Filter interface
    // whose accept method
    // accepts all strings of length < 5.
}
