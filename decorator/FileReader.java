<<<<<<< HEAD
=======
package decorator;
>>>>>>> 364e7bfdb6876c9309e3be6e7381137274ff07cd
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public static ArrayList<String> getLines(String fileName) {
        ArrayList<String> lines = new ArrayList<String>();

        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                lines.add(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }

        return lines;
    }
<<<<<<< HEAD
=======
    
    /*public static void main(String[] args) {
        ArrayList<String> lines = getLines("hat.txt");
        for (String line : lines) {
            System.out.println(line);
        }
        ArrayList<String> lines1 = getLines("potatoe-head.txt");
        for (String line : lines1) {
            System.out.println(line);
        }
        ArrayList<String> lines2 = getLines("nose.txt");
        for (String line : lines2) {
            System.out.println(line);
        }
        ArrayList<String> lines3 = getLines("ears.txt");
        for (String line : lines) {
            System.out.println(line);
        }
        
    }*/
>>>>>>> 364e7bfdb6876c9309e3be6e7381137274ff07cd
}
