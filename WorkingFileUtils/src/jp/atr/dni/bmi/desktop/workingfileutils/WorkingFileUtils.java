/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.atr.dni.bmi.desktop.workingfileutils;

import java.io.File;
import java.io.IOException;
import jp.atr.dni.bmi.desktop.neuroshareutils.Entity;

/**
 *
 * @author kharada
 */
public class WorkingFileUtils {

    private final String WS_HOME = "." + File.separator + "workingfiles" + File.separator;
    private String workingFilePath;

    public WorkingFileUtils() {
        this.workingFilePath = "";
    }

    public WorkingFileUtils(String workingFilePath) {
        this.workingFilePath = workingFilePath;
    }

    public boolean createWorkingFileFromNeuroshare(String sourceFilePath, Entity entity) throws IOException {
        String tmpFilePath = WS_HOME + System.currentTimeMillis() + "_" + hashCode() + ".csv";
        File file = new File(tmpFilePath);

        // Create workingfiles dir if it  does not exist.
        File dir = file.getParentFile();
        if(!dir.exists()){
            dir.mkdirs();
        }

        // Create the file.
        if (!file.createNewFile()) {
            return false;
        }

        // Write Neuroshare Data to the working file.
        CSVWriter nsCsvWriter = new CSVWriter();
        nsCsvWriter.createCSVFileFromNeuroshare(file.getAbsolutePath(), sourceFilePath, entity);

        this.workingFilePath = file.getAbsolutePath();
        return true;
    }

    public boolean createWorkingFileFromPlexon(String sourceFilePath, Entity entity) throws IOException {
        String tmpFilePath = WS_HOME + System.currentTimeMillis() + "_" + hashCode() + ".csv";
        File file = new File(tmpFilePath);

        // Create workingfiles dir if it  does not exist.
        File dir = file.getParentFile();
        if(!dir.exists()){
            dir.mkdirs();
        }

        // Create the file.
        if (!file.createNewFile()) {
            return false;
        }

        // Write Neuroshare Data to the working file.
        CSVWriter nsCsvWriter = new CSVWriter();
        nsCsvWriter.createCSVFileFromPlexon(file.getAbsolutePath(), sourceFilePath, entity);

        this.workingFilePath = file.getAbsolutePath();
        return true;
    }
    public boolean createWorkingFileFromBlackRockNev(String sourceFilePath, Entity entity) throws IOException {
        String tmpFilePath = WS_HOME + System.currentTimeMillis() + "_" + hashCode() + ".csv";
        File file = new File(tmpFilePath);

        // Create workingfiles dir if it  does not exist.
        File dir = file.getParentFile();
        if(!dir.exists()){
            dir.mkdirs();
        }

        // Create the file.
        if (!file.createNewFile()) {
            return false;
        }

        // Write Neuroshare Data to the working file.
        CSVWriter nsCsvWriter = new CSVWriter();
        nsCsvWriter.createCSVFileFromBlackRockNev(file.getAbsolutePath(), sourceFilePath, entity);

        this.workingFilePath = file.getAbsolutePath();
        return true;
    }
    public boolean createWorkingFileFromBlackRockNsx(String sourceFilePath, Entity entity) throws IOException {
        String tmpFilePath = WS_HOME + System.currentTimeMillis() + "_" + hashCode() + ".csv";
        File file = new File(tmpFilePath);

        // Create workingfiles dir if it  does not exist.
        File dir = file.getParentFile();
        if(!dir.exists()){
            dir.mkdirs();
        }

        // Create the file.
        if (!file.createNewFile()) {
            return false;
        }

        // Write Neuroshare Data to the working file.
        CSVWriter nsCsvWriter = new CSVWriter();
        nsCsvWriter.createCSVFileFromBlackRockNsx(file.getAbsolutePath(), sourceFilePath, entity);

        this.workingFilePath = file.getAbsolutePath();
        return true;
    }

    public boolean removeWorkingFile() {
        return new File(workingFilePath).delete();
    }

    /**
     * @return the workingFilePath
     */
    public String getWorkingFilePath() {
        return workingFilePath;
    }

    /**
     * @param workingFilePath the workingFilePath to set
     */
    public void setWorkingFilePath(String workingFilePath) {
        this.workingFilePath = workingFilePath;
    }
}
