package com.ps;

class Calculator {
    public static void main(String[] args) {
        int sum = addition(200,500);
        System.out.println(sum);

        int result = subtract(1000,100);
        System.out.println(result);

    }

    //Static add method
        public static int addition(int numberone,int numbertwo){
            return numberone+ numbertwo;

        }

    //Static subtract method
    public static int subtract(int numOne, int numTwo){
        return numOne - numTwo;

    }



    //Static multiplication


    //Static division

    //Receive two inputs (ints)
    //Return a single number (ints, double)
}
