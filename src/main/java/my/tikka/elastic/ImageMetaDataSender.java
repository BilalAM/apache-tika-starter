package my.tikka.elastic;

import my.tikka.RandomTikkaUtils;
import org.apache.commons.io.FileUtils;
import org.elasticsearch.action.index.IndexResponse;

import java.io.File;
import java.util.Map;

/**
 * A wrapper class to create the metadata of an image (jpg , jpeg or png) to easily send it to kibana
 */
public class ImageMetaDataSender {

    private static final String IMAGES_FOLDER_DIRECTORY = "/home/bilalam/Pictures/";

    private static void sendImageResponse(Map<String, String> metadata) {
        try {
            IndexResponse response = Singleton
                    .getTransportClient()
                    .prepareIndex("filesystem", "picture")
                    .setSource(metadata)
                    .get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sendData() {
        try {
            for (File file : FileUtils.listFiles(new File(IMAGES_FOLDER_DIRECTORY), new String[]{"png", "jpg"}, true)) {
                sendImageResponse(RandomTikkaUtils.getFileMetaData(file));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
