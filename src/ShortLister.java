//FFFFFFIIIIIIIXXXXXXX
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;

import static java.nio.file.StandardOpenOption.CREATE;

public class ShortLister {
//lets the user pick a text file (JFileChooser)
// uses the filter to display the short words from the file, only
public static void main(String[] args) {
    ArrayList<Filter> objects = new ArrayList<>();

    ShortWordFilter e1 = new ShortWordFilter("Tom");
    ShortWordFilter e2 = new ShortWordFilter("Tomooooo"); // cool new fact one of the doctors in doctor who... which?
    ShortWordFilter e3 = new ShortWordFilter("djot");

    objects.add(e1);
    objects.add(e2);
    objects.add(e3);
///somthing going on here ummmmmmm?????
    CollectAll.CollectAll(objects);////here right here is the problem+++++++++++++

    /////////////////////////////////////////////////////////////////////

        JFileChooser chooser = new JFileChooser();
        Scanner inFile;
        String line = "";
        Path target = new File(System.getProperty("user.dir")).toPath();

        target = target.resolve("src");


        chooser.setCurrentDirectory(target.toFile());

        try {

            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                target = chooser.getSelectedFile().toPath();

                inFile = new Scanner(target);

                while (inFile.hasNextLine()) {


                    line = inFile.nextLine();
                    String[] splitValues = line.split(", ");

                    System.out.printf("\n%-30s %-30s %-30s %-30s", splitValues[0], splitValues[1], splitValues[2], splitValues[3]);
                }
                inFile.close();
            } else {
                System.out.println("Sorry, you must select a file! Termininating!");
                System.exit(0);
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("File Not Found Error");
            e.printStackTrace();
        } catch (
                IOException e) {
            System.out.println("IOException Error");
            e.printStackTrace();
        }
    }
}
