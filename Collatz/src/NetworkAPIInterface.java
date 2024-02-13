package collatz.src;
public interface NetworkAPIInterface {
    // sending input as path
    // geting the delimeter will be ';'
    // setting up the output path(where the output csv will be saved to) 
    String getPath(User inputPath);
    char getDelimeter(User delimeter);
    void setOutputPath(User outputPath);
}
