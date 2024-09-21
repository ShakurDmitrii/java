package org.example;
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
        if(b == 0){
            try {
                throw new Exception("на 0 делить нельзя");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        int c = a /b;
        return c;
    }
}