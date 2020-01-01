package com.mphasis.incident.incidentUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnZipFile {

    public  static List<String> unzipFiles(String sourceDir, String destDir)  throws Exception{
        List<String> fileNamesList = new ArrayList<>();
        List<String> result = new ArrayList<>();

        File folder = new File(sourceDir);
        fileNamesList = listAllFiles(folder);

        for (String fileName : fileNamesList) {
            result.add( unzip(sourceDir + fileName, destDir));
            System.out.println("ZIP File Name >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+fileName);

        }
        return  result;
    }


    public static List<String>  listAllFiles(File folder){
        List<String> fileNamesList = new ArrayList<>();

        File[] fileNames = folder.listFiles();
        for(File file : fileNames){
             if(!file.isDirectory()){
                 fileNamesList.add(file.getName());
            }
        }
        return fileNamesList;


    }
    private static String unzip(String zipFilePath, String destDir) {
        List<String> fileNamesList = new ArrayList<>();
        File dir = new File(destDir);
        String fileName = null;
        // create output directory if it doesn't exist
        if(!dir.exists()) dir.mkdirs();
        FileInputStream fis;
        //buffer for read and write data to file
        byte[] buffer = new byte[1024];
        try {
            fis = new FileInputStream(zipFilePath);
            ZipInputStream zis = new ZipInputStream(fis);
            ZipEntry ze = zis.getNextEntry();
            while(ze != null){
                fileName = ze.getName();
                fileName = "InProgress_"+fileName;

                File newFile = new File(destDir + File.separator + fileName);
                System.out.println("Unzipping to "+newFile.getAbsolutePath());
                //create directories for sub directories in zip
                new File(newFile.getParent()).mkdirs();
                FileOutputStream fos = new FileOutputStream(newFile);
                int len;
                while ((len = zis.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                }
                fos.close();
                //close this ZipEntry
                zis.closeEntry();
                ze = zis.getNextEntry();

            }
            //close last ZipEntry
            zis.closeEntry();
            zis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileName;
    }




}