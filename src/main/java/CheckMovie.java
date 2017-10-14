import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by mzaferanloo on 12/3/2016.
 */
public class CheckMovie {

    public static boolean checkHas(String number) {
        try {
            //CheckMovie.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath() +
            File file = new File("movieIds.txt");
            System.out.println(file.getAbsolutePath());
            Scanner scanner = new Scanner(file);
            int lineNum = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lineNum++;
                if (line.contains(number)) {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            //handle this
        }
        return false;
    }

    public static void addToFile(String number) {
        try {
            String filename = "movieIds.txt";
            FileWriter fw = new FileWriter(filename, true); //the true will append the new data
            fw.write(" - " + number);//appends the string to the file
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
}