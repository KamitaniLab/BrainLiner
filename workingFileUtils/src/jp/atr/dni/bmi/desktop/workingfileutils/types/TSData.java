/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.atr.dni.bmi.desktop.workingfileutils.types;

import java.util.ArrayList;

/**
 *
 * @author Keiji Harada [*1]</br>[*1] ATR Intl. Computational Neuroscience Labs, Decoding Group
 * @version 2011/04/22
 */
public class TSData {

    private static final String formatCode = "TS";
    private double samplingRate;
    private ArrayList<Double> timeStamps = new ArrayList<Double>();
    private ArrayList<ArrayList<Double>> values = new ArrayList<ArrayList<Double>>();

    /**
     *
     */
    public TSData() {
        this.samplingRate = 0.0;
    }

    /**
     *
     * @param samplingRate
     */
    public TSData(double samplingRate) {
        this.samplingRate = samplingRate;
    }

    /**
     *
     * @return
     */
    public String getFormatCode() {
        return this.formatCode;
    }

    /**
     *
     * @param rowIndex
     * @return
     */
    public double getTimeStamp(int rowIndex) {
        return this.timeStamps.get(rowIndex);
    }

    /**
     *
     * @param rowIndex
     * @param timestamp
     */
    public void setTimeStamp(int rowIndex, double timestamp) {
        this.timeStamps.set(rowIndex, timestamp);
    }

    /**
     *
     * @param timeStamp
     */
    public void addTimeStamp(double timeStamp) {
        this.timeStamps.add(timeStamp);
    }

    /**
     *
     * @param rowIndex
     */
    public void removeTimeStamp(int rowIndex) {
        this.timeStamps.remove(rowIndex);
    }

    /**
     *
     * @param rowIndex
     * @return
     */
    public ArrayList<Double> getValues(int rowIndex) {
        return this.values.get(rowIndex);
    }

    /**
     *
     * @param rowIndex
     * @param valuesInTheRow
     */
    public void setValues(int rowIndex, ArrayList<Double> valuesInTheRow) {
        this.values.set(rowIndex, valuesInTheRow);
    }

    /**
     *
     * @param valuesInTheRow
     */
    public void addValues(ArrayList<Double> valuesInTheRow) {
        this.values.add(valuesInTheRow);
    }

    /**
     *
     * @param rowIndex
     */
    public void removeValues(int rowIndex) {
        this.values.remove(rowIndex);
    }

    /**
     *
     * @param rowIndex
     * @param colIndex
     * @return
     */
    public double getValue(int rowIndex, int colIndex) {
        return this.values.get(rowIndex).get(colIndex);
    }

    /**
     *
     * @param rowIndex
     * @param colIndex
     * @param value
     */
    public void setValue(int rowIndex, int colIndex, double value) {
        this.values.get(rowIndex).set(colIndex, value);
    }

    /**
     *
     * @param rowIndex
     * @param value
     */
    public void addValue(int rowIndex, double value) {
        this.values.get(rowIndex).add(value);
    }

    /**
     *
     * @param rowIndex
     * @param colIndex
     */
    public void removeValue(int rowIndex, int colIndex) {
        this.values.get(rowIndex).remove(colIndex);
    }

    /**
     * @return the samplingRate
     */
    public double getSamplingRate() {
        return this.samplingRate;
    }

    /**
     * @param samplingRate the samplingRate to set
     */
    public void setSamplingRate(double samplingRate) {
        this.samplingRate = samplingRate;
    }

    /**
     * @return the timeStamps
     */
    public ArrayList<Double> getTimeStamps() {
        return timeStamps;
    }

    /**
     * @param timeStamps the timeStamps to set
     */
    public void setTimeStamps(ArrayList<Double> timeStamps) {
        this.timeStamps = timeStamps;
    }

    /**
     * @return the values
     */
    public ArrayList<ArrayList<Double>> getAllValues() {
        return values;
    }

    /**
     * @param values the values to set
     */
    public void setAllValues(ArrayList<ArrayList<Double>> values) {
        this.values = values;
    }
}
