package br.com.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {


    public static void main(String[] args) {
    	
    	try {
    
    	File tmpFile = File.createTempFile("test", ".tmp");
    	FileWriter writer = new FileWriter(tmpFile);
    
        StringBuilder sb = new StringBuilder();
        final String arquivo = "//home//dev//Documentos//icconsig//log.txt";
     

        try (BufferedReader br = Files.newBufferedReader(Paths.get(arquivo))) {

            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
            	String line_resu = Tools.extractAndroidLogLine(line);
        	    writer.write(line_resu);
        	   
                sb.append(line_resu).append("\n");
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        writer.close();
        System.out.println(sb);
        
    	}catch (Exception e) {
    		e.printStackTrace();
    	}

    }

}