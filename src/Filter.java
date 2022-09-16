import java.util.ArrayList;

public interface Filter
{
    static void CollectAll(ArrayList<Filter> objects) {

    }

    boolean accept(Object x);
}
