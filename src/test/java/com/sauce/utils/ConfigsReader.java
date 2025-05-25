package com.sauce.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConfigsReader {

    private static Properties prop;
    private static final Pattern ENV_VAR_PATTERN = Pattern.compile("\\$\\{([^:]+)(?::([^}]*))?\\}");

    /**
     * This method reads the properties of the config file located in
     * src/test/resources
     *
     * @param filePath
     */
    public static void readProperties(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            prop = new Properties();
            prop.load(fis);
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method returns the value from properties, resolving any environment
     * variable placeholders in the format ${ENV_VAR:defaultValue}
     *
     * @param String key
     * @return String value
     */
    public static String getProperty(String key) {
        String value = prop.getProperty(key);
        if (value != null) {
            // Process placeholders like ${ENV_VAR:defaultValue}
            Matcher matcher = ENV_VAR_PATTERN.matcher(value);
            if (matcher.find()) {
                String envVarName = matcher.group(1);
                String defaultValue = matcher.group(2); // May be null if no default

                String envValue = System.getenv(envVarName);
                if (envValue != null && !envValue.isEmpty()) {
                    return envValue;
                } else if (defaultValue != null) {
                    return defaultValue;
                }
            }
        }
        return value;
    }
}