package my.tikka;


import my.tikka.elastic.ImageMetaDataSender;

import java.io.File;


public class Main {

    public static void main(String[] arg) throws Exception {

        ImageMetaDataSender.sendData();

    }

    private static File createFile(String fileName) {
        return new File(fileName);
    }

}
