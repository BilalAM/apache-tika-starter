package my.tikka;


import my.tikka.elastic.ImageMetaDataSender;
import my.tikka.elastic.Sender;
import tikka.RandomTikkaUtils;

import java.io.File;


public class Main {

    public static void main(String[] arg) throws Exception {

       Sender.sendData("/home/bilalam/Documents/","pdfs","pdf");

    }

    private static File createFile(String fileName) {
        return new File(fileName);
    }

}
