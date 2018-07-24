package my.tikka.elastic;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Singleton {
    private static TransportClient CLIENT_INSTANCE;

    private Singleton() {

    }

    public static TransportClient getTransportClient() throws UnknownHostException {
        if (CLIENT_INSTANCE == null) {
            CLIENT_INSTANCE = new PreBuiltTransportClient(getSettings()).addTransportAddress(
                    new TransportAddress(InetAddress.getByName("localhost"), 9300));
        } else {
            return CLIENT_INSTANCE;
        }
        return CLIENT_INSTANCE;
    }

    private static Settings getSettings() {
        return Settings.builder().put("client.transport.sniff", true).build();
    }

}
