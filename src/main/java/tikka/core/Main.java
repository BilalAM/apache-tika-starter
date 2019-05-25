package tikka.core;

import tikka.core.abstractDocuments.WordDocument;
import tikka.core.mappings.Mapper;
import tikka.core.mappings.WordMapper;

import java.io.File;

public class Main {

    public static void main(String[] arg) throws Exception {

        File file = new File("any word document here..");
        Mapper mapper = new WordMapper();
        WordDocument document = ((WordMapper) mapper).mapDocumentOf(file);
        ((WordMapper) mapper).getAllProperties().forEach((key, value) -> {
            System.out.println(key + " ----- " + value);
        });



    }

}

