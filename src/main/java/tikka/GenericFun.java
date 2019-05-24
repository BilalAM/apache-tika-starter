package tikka;

import org.apache.commons.io.FileUtils;
import tikka.core.tika.RandomTikkaUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
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
        File f = new File("/home/bilalam/Documents/books/books/");
        Collection<File> pdfFiles = FileUtils.listFiles(f, new String[]{"pdf"}, true);
        for (File _file : pdfFiles) {

            // long cpu extensive operation
            authors.add(RandomTikkaUtils.getSpecificMetadata(_file, "producer"));
        }
        return authors;
    }



}
