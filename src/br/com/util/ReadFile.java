package br.com.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {


    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        final String arquivo = "//home//dev//Documentos//xxxx//log.txt";
     

        try (BufferedReader br = Files.newBufferedReader(Paths.get(arquivo))) {

            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
            	String line_resu = Tools.extractAndroidLogLine(line);
                sb.append(line_resu).append("\n");
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

        System.out.println(sb);

    }

}