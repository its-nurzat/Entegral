package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //This class will responsible for loading properties file and will provide access
    //to values based on key names
    private static Properties configFile;

    static {
        try {
            //provide access to the file that we created
            FileInputStream fileInputStream = new FileInputStream("configuration.properties");

            configFile = new Properties();
            configFile.load(fileInputStream);

        } catch (IOException e) {
            System.out.println("Failed to load properties file !");
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {

        return configFile.getProperty(key);
    }
}
