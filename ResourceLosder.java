package application;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author almgwary
 * Apr 25, 2016  6:36:04 PM  
 * UI_test    
 * ResourceLosder.java
 */
public class ResourceLoder {
	
	public static InputStream loud (String path){
		InputStream input = ResourceLoder.class.getResourceAsStream(path);
		if (input== null) {
			input = ResourceLoder.class.getResourceAsStream("/"+path);
			
		}
		return input ;
	}

    public static File getFile (String resource){
    	return getResourceAsFile(resource);
    }
    
    
    
   
    public static File getResourceAsFile(String resourcePath) {
        try {
            InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream(resourcePath);
            if (in == null) {
                return null;
            }

            File tempFile = File.createTempFile(String.valueOf(in.hashCode()), ".tmp");
            tempFile.deleteOnExit();

            try (FileOutputStream out = new FileOutputStream(tempFile)) {
                //copy stream
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
            }
            return tempFile;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


}
