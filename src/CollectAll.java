//////FFFFFFFIIIIIIXXXXXX

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class CollectAll {


    /////////////SOMETHING IS WRONG HERE///////////////////////
    public static ArrayList<Object> CollectAll(ArrayList<Object> objects, Filter f) {
        ArrayList<Object> result = new ArrayList<Object>();

        for (Object obj : objects) {
            if (f.accept(obj)) {
                result.add(obj);
            }
        }
        return result;
    }
}


// public class CollectAll {
//     static void CollectAll(ArrayList<ShortWordFilter> objects) {
//
//
// //return all objects in the objects array that are accepted by the given filter.
//
//
//         //Method. Collectall(). Return objects, accepted by filter.
//         public static void CollectAll{
//         //takes array list
//         //filters array list
//
//     for(Filter ob:objects) // tc:=each. .costs=arraylists
//         {
//                 System.out.println(ob.accept());
//         }
//
//                 //outputs array list to file.
//
//         }
//          //   if all objects in arry tru based accept tru add to file
//         // File workingDirectory = new File(System.getProperty("user.dir"));
//         //fileName = SafeInput.getNonZeroLenString(fileNamein, "Please enter file name (Don't include .txt)");
//         //Path file = Paths.get(workingDirectory.getPath() + "//src//"+fileName+".txt");
//
//
//
// }
//
//  //
//
//         File workingDirectory = new File(System.getProperty("user.dir"));
//         Path file = Paths.get(workingDirectory.getPath() + "//src//Objects1.txt");
//
//         try {
//
//             OutputStream out =
//                     new BufferedOutputStream(Files.newOutputStream(file, CREATE));
//             BufferedWriter writer =
//                     new BufferedWriter(new OutputStreamWriter(out));
//             for (ShortWordFilter obj : objects) // tc:=each. .costs=arraylists
//             {
//                 System.out.println(obj.accept(objects));
//             }
//             writer.close();
//             System.out.println("Data file written: Objects1.txt ");
//         } catch (
//                 IOException e) {
//             e.printStackTrace();
//         }
//
//
//     }



