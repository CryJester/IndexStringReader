package app.Factory;

import app.Rules.FileTextReader;
import app.Rules.FileTextReaderLengthGreaterThan5;
import app.Rules.FileTextReaderNoRules;
import app.Rules.FileTextReaderStartUpperCase;

public class FileTextReaderFactory {

    public static FileTextReader createFileTextReader(String rules) {
        return switch (rules) {
            case "StartUpperCase" -> new FileTextReaderStartUpperCase();
            case "LengthGreaterThan5" -> new FileTextReaderLengthGreaterThan5();
            default -> new FileTextReaderNoRules();
        };
    }

}
