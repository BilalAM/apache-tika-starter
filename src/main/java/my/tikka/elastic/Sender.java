package my.tikka.elastic;

import com.google.gson.Gson;
import my.tikka.mappings.Document;
import my.tikka.mappings.Mapper;
import my.tikka.mappings.WordMapper;
import org.apache.commons.io.FileUtils;
import org.apache.tika.metadata.Metadata;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.common.xcontent.XContentType;
import org.json.simple.JSONObject;
import tikka.RandomTikkaUtils;

import java.io.File;
import java.util.Map;

public class Sender {

    private static void sendIndexMeta(Document document, String typeName) {
        try {
            String responseDocument = new Gson().toJson(document);
            IndexResponse response = Singleton
                    .getTransportClient()
                    .prepareIndex("filesystem-word", typeName)
                    .setSource(responseDocument, XContentType.JSON)
                    .get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sendData(Mapper mappingStrategy, Document documentStrategy, String directoryPath, String typeName, String... extensions) {
        try {
            for (File _file : FileUtils.listFiles(new File(directoryPath), extensions, true)) {
                documentStrategy = (Document) mappingStrategy.mapDocumentOf(_file);
                sendIndexMeta(documentStrategy, typeName);
                System.out.println("data sent...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
