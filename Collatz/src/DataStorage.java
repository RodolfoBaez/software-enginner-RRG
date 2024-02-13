package collatz.src;
public class DataStorage implements DsInterface {
    public boolean isCsvFile(String userInput){
        return false;
    }
    public int[] readFirstRowAsIntegers(String csvFilePath){
        int[] arr = {0};
        return arr;
    }
    
    public boolean isIntDoubleArray(Object userInput){
        return false;
    }
    public void writeDoubleArrToCsv(int[][] arr, String csvFilePath){
        
    }
}

