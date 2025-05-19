package app.Rules;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Reading text file, apply no rule and return all words inside as list of string
 */
public class FileTextReaderNoRules implements FileTextReader {

    public List<String> readTextFile(String inputFilePath) {
        List<String> resultList = new LinkedList<>();

        try {
            Scanner scanner = new Scanner(new File(inputFilePath));
            while (scanner.hasNext() ) {
                resultList.add(scanner.next());
            }
            scanner.close();
        } catch (Exception ex) {
            System.out.println("File Error :  " + ex.getMessage() + "\n" + Arrays.toString(ex.getStackTrace()));
        }

        return resultList;
    }
}
