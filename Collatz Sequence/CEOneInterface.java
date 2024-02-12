public interface CEOneInterface {
    // checking the user input must be a csv, will be sent to data storage to be converted into int[]
    // checking if the intArr is correct, will be sent to CE2 for computation 
    // checking if intArrDouble is correct, it is the output of CE2, will be send to Data Storage to be converted into csv file with 2 rows 
    boolean isCsvFile(String userInput);
    boolean isIntArray(Object userInput);
    boolean isIntDoubleArray(Object userInput);
    
}    