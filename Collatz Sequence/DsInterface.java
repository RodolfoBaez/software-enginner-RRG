public interface DsInterface {
    // method will take in csvpath and convert csv into int[] to be work on in CE
    // after compuation is done We have to convert output that will be an int[][] back into a csv for output
    int[] readFirstRowAsIntegers(String csvFilePath);
    void writeDoubleArrToCsv(int[][] arr, String csvFilePath);
}
