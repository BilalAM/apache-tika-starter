package my.tikka;


import my.tikka.elastic.ImageMetaDataSender;
import my.tikka.elastic.Sender;

import java.io.File;


public class Main {

    public static void main(String[] arg) throws Exception {

        Sender.getStringMetadata(new File("hobbit.jpg"));

    }

    private static File createFile(String fileName) {
        return new File(fileName);
    }

}
