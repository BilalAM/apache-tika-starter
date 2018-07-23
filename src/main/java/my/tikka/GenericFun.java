package my.tikka;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class GenericFun {

    /**
     * Returns a list of all .pdfs files authors from a folder
     * This method DOES NOT take into account incorrect extension files
     * What if a pdf file is saved with an extension OTHER than .pdf ? This method will ignore that file
     * and continue with the rest...
     */
    public static List<String> getAllPdfsAuthors() throws Exception {
        List<String> authors = new ArrayList<>();
        File f = new File("/home/bilalam/Documents/");
        for (File ff : FileUtils.listFiles(f, new String[]{"pdf"}, true)) {
            authors.add(RandomTikkaUtils.getSpecificMetadata(ff, "Author"));
        }
        return authors;
    }

}
