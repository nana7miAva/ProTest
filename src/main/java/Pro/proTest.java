package Pro;

import Utils.ReadPro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class proTest {
    public static void main(String[] args) throws IOException {
        /*Properties properties = new Properties();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("config/Client_info.properties"));
            System.out.println(reader);
            properties.load(reader);
            System.out.println(properties);
            System.out.println(properties.getProperty("http"));
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        Properties pop = ReadPro.readConfig("Client_info.properties");
        System.out.println(pop);
        String defaultName = pop.getProperty("minio.default-name");
        String httpsAddress = pop.getProperty("minio.https.address");
        String minio_adress = pop.getProperty("minio.address");
        String secret_key = pop.getProperty("minio.secret-key");
        String access_key = pop.getProperty("minio.access-key");
        String minio_port = pop.getProperty("minio.port");
        String minio_ip = pop.getProperty("minio.ip");
        String index = pop.getProperty("index");
        String http = pop.getProperty("http");
        String port = pop.getProperty("port");
        String scheme = pop.getProperty("scheme");

        System.out.println(defaultName);
        System.out.println(httpsAddress);
        System.out.println(minio_adress);
        System.out.println(secret_key);
        System.out.println(access_key);
        System.out.println(minio_port);
        System.out.println(minio_ip);
        System.out.println(index);
        System.out.println(http);
        System.out.println(port);
        System.out.println(scheme);


    }
}
