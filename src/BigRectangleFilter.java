//done
import java.awt.*;

public class BigRectangleFilter implements Filter {//implements the Filter interface

    public BigRectangleFilter() {}
    @Override//accepts all java Rectangle objects // that have a perimeter > 10.
    public boolean accept(Object x) {
        Rectangle rect;
        rect = (Rectangle) x;
        boolean pr;
        pr = (((rect.width * rect.height) * 2) > 10);
        if (pr) {
            return pr;
        }
        return false;
    }
}