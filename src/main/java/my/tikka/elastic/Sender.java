package my.tikka.elastic;

import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;
import org.apache.tika.metadata.Metadata;
import org.elasticsearch.action.index.IndexResponse;
import tikka.RandomTikkaUtils;

import java.io.File;
import java.util.Map;

public class Sender {

    private static void sendIndexMeta(Map<String, String> metadata, String typeName) {
        try {


            IndexResponse response = Singleton
                    .getTransportClient()
                    .prepareIndex("filesystem", typeName)
                    .setSource(metadata)
                    .get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sendData(String directoryPath, String typeName, String... extensions) {
        try {
            for (File _file : FileUtils.listFiles(new File(directoryPath), extensions, true)) {
                sendIndexMeta(RandomTikkaUtils.getFileMetaData(_file), typeName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
