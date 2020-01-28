package com.company;

public class Main {

    public static void test(){
        int a = 91;
        if(1 > 4){
            double b = 9.0;
            System.out.println(a);
        }
    }

    public static void main(String[] args) {

        printText();
        printText();
        printText();

        addition(2, 7);



    }
    public static void printText(){
        System.out.println("GeekTech");
        System.out.println("Hello");
        System.out.println("Java");
    }
    public static void addition(int num1, int num2){
        System.out.println(num1 + num2);
    }
}
