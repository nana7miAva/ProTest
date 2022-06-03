package Utils;

import java.io.*;
import java.util.Properties;

public class ReadPro {
    public static Properties readConfig(String configFileName) throws IOException {
        Properties properties = new Properties();

        InputStream in = ReadPro.class.getClassLoader().getResourceAsStream(configFileName);

        //优先使用外部配置文件 路径为  jar包所在目录
        String path = System.getProperty("user.dir") + "/" + "config" + "/" + configFileName;

        try {
            in = new BufferedInputStream(new FileInputStream(path));
            // properties.load(in);
        } catch (Exception e) {
            in = ReadPro.class.getClassLoader().getResourceAsStream(configFileName);

        }

        properties.load(new InputStreamReader(in, "utf-8"));


        return properties;
    }
}