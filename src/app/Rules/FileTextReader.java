package app.Rules;

import java.util.List;


/**
 * Please extend this interface to define the rules that you want to implement
 */
public interface FileTextReader {

    /**
     * Reading all words from inputFilePath file, apply the rules and return it as list of words
     */
    List<String> readTextFile(String inputFilePath);

}
