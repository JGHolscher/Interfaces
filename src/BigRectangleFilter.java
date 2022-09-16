//done
import java.awt.*;

public class BigRectangleFilter implements Filter{//implements the Filter interface

    //public static boolean accept = true;
    //public static boolean accept;
    private Rectangle rect;
    public BigRectangleFilter(Rectangle rect) {
        this.rect = rect;
    }

    @Override//accepts all java Rectangle objects // that have a perimeter > 10.
    public boolean accept(Object obj) {
        Rectangle rect = (Rectangle) obj;
        return (rect.height * rect.width) > 10;

    }

}



