
import java.awt.*;
import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class BigRectLister {

    public static ArrayList<Object> CollectAll(Filter fil, Object[] obj) {
        ArrayList<Object> objs = new ArrayList<>();

        for (Object x:obj) {
            if (fil.accept(x)) {
                objs.add(x);
            }
        }
        return objs;
    }
    public static void main(String[] args) {
        BigRectangleFilter myBigRectangleFilter = new BigRectangleFilter();

        //creates an ArrayList of 10 Rectangles of diff sizes
        ArrayList<Rectangle> bigRect = new ArrayList<Rectangle>();

        Rectangle r1 = new Rectangle(2,5); //big
        Rectangle r2 = new Rectangle(1,3);//6
        Rectangle r3 = new Rectangle(78,90);//big
        Rectangle r4 = new Rectangle(5,7); //big
        Rectangle r5 = new Rectangle(1,4);// 8
        Rectangle r6 = new Rectangle(1,2); //4
        Rectangle r7 = new Rectangle(1,1);//1       
        Rectangle r8 = new Rectangle(2,2);//8
        Rectangle r9 = new Rectangle(60,10);//big
        Rectangle r10 = new Rectangle(30, 4);//big
        
        bigRect.add(r1);
        bigRect.add(r2);
        bigRect.add(r3);
        bigRect.add(r4);
        bigRect.add(r5);
        bigRect.add(r6);
        bigRect.add(r7);
        bigRect.add(r8);
        bigRect.add(r9);
        bigRect.add(r10);

    //Use the collectAll method
    // to list the rectangles that have big perimeters only

        System.out.println(CollectAll(myBigRectangleFilter, bigRect.toArray()));
    }


   

}
