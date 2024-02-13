package test;

import org.junit.Test;

import Collatz.src.ProcessAPI;

public class ProcessAPITest {

    @Test
    public void testGetInputArr() {
        // Create an instance of ProcessAPI
        ProcessAPI api = new ProcessAPI();

        // Call the method being tested
        int[] inputArr = api.getInputArr();

    }

    @Test
    public void testGetOutput() {
        // Create an instance of ProcessAPI
        ProcessAPI api = new ProcessAPI();

        // Call the method being tested
        int[][] outputArr = api.getOutput();

    }
}
