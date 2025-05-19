package app.App;

import app.Factory.FileTextReaderFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class IndexStringReaderMain {

    static List<String> inputFile = new LinkedList<>();
    static String output = "";

    public static void runReader(String[] args) throws IOException {
        //Read args params to convert into List<String>
        inputFile.addAll(Arrays.stream(args).toList());

        //You may apply the rules in here based on created rules class
        inputFile.forEach(file -> {
            //1st rule
            output = output + FileTextReaderFactory.createFileTextReader("LengthGreaterThan5").readTextFile(file).
                    size() + "\n";

            //2nd rule
            FileTextReaderFactory.createFileTextReader("StartUpperCase").readTextFile(file).forEach(word ->
                    output = output + word + " ");

            output = output + "\n" + "\n";
        });

        //Write result to output file
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write(output);
        writer.close();
    }

}
