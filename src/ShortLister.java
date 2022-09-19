//FFFFFFIIIIIIIXXXXXXX
import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class ShortLister {
    //COLLECT ALL - runs filter on array list //////////////////DONE//////////////////////////
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
        ShortWordFilter myShortWordFilter = new ShortWordFilter();

        //FILE PICKER DON'T TOUCH
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

                ArrayList<String> shortWords = new ArrayList<>();

                while (inFile.hasNextLine()) {
                    line = inFile.nextLine();
                    shortWords.add(line);
                }
                    System.out.println(shortWords);//only to show it worked in ss - unfiltered
                   System.out.println(CollectAll(myShortWordFilter, shortWords.toArray()));//..................................................

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

