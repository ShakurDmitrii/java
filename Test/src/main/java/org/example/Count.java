package org.example;

import java.util.logging.Level;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Count {


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
        Logger log = LogManager.getLogger(Count.class);
        if(b == 0){
          log.error("div by zero");
        }
        int c = a /b;
        return c;
    }
}