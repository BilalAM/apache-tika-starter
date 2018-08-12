package tikka.core.elastic;

import com.google.gson.Gson;
import tikka.core.mappings.Document;
import tikka.core.mappings.Mapper;
import org.apache.commons.io.FileUtils;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.common.xcontent.XContentType;


import java.io.File;

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
