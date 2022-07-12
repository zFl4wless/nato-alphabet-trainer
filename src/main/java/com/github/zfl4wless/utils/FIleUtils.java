package com.github.zfl4wless.utils;

import com.github.zfl4wless.Main;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

public class FIleUtils {

    /**
     * Reads the content of a resource file from classpath.
     * @param name The name of the resource.
     * @return The content of the file..
     */
    public static String readResource(String name) {
        try {
            InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(name);
            StringWriter stringWriter = new StringWriter();

            if (inputStream != null) {
                IOUtils.copy(inputStream, stringWriter, "UTF-8");
            }
            return stringWriter.toString();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return null;
    }
}
