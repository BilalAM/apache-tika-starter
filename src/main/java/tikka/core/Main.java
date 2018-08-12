package tikka.core;


import tikka.RandomTikkaUtils;

import java.io.File;


public class Main {

    public static void main(String[] arg) throws Exception {
        // Sender.sendData(new WordMapper(), new WordDocument(), "/home/bilalam/Documents/", "word-docs", "odt", "doc", "docx");
        RandomTikkaUtils.getFileMetaData(new File("/home/bilalam/Pictures/IMG-20150828-WA0002.jpg")).forEach((key, value) -> {
            System.out.println(key + "    " + value);
        });
    }

    private static File createFile(String fileName) {
        return new File(fileName);
    }

}
