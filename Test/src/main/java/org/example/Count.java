package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Count {

    private static Logger log = Logger.getLogger(Count.class.getName());
    public  int sum(int a, int b){
        int c = a + b;
        return c;
    }
    public  int compare(int a, int b){
        return a * b;
    }
    public  int diff(int a, int b){
        return a - b;
    }
    public  int div(int a, int b){
        if(b == 0){
            try {
                throw new Exception("на 0 делить нельзя");
            } catch (Exception ex) {
                log.log(Level.SEVERE, "Exception: ", ex);
                throw new RuntimeException(ex);
            }
        }
        int c = a /b;
        return c;
    }
}