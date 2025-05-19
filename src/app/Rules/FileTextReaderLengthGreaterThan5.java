package app.Rules;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Reading text file, apply rule that word length must be greater than 5 and return all words inside as list of string
 */
public class FileTextReaderLengthGreaterThan5 implements FileTextReader {

    public List<String> readTextFile(String inputFilePath) {
        List<String> resultList = new LinkedList<>();

        try {
            Scanner scanner = new Scanner(new File(inputFilePath));
            while (scanner.hasNext()) {
                String currentWord = scanner.next();
                if(currentWord.length() > 5) {
                    resultList.add(currentWord);
                }
            }
            scanner.close();
        } catch (Exception ex) {
            System.out.println("File Error :  " + ex.getMessage() + "\n" + Arrays.toString(ex.getStackTrace()));
        }

        return resultList;
    }
}
