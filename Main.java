package com.company;


public class Main {

    public static void main(String[] args) {
        int test=multiplicationInverse(39,4);
        if (test!=-1){
            System.out.println("Multiplication inverser of 4 at base 39 is "+test );
        }else {
            System.out.println("No multiplication inverse found");
        }


    }

    public static int multiplicationInverse(int base, int number){
        int result=-1;
        for (int i=0;i<base;i++){
            if ((i*number)%base==1){
                result=i;
                break;
            }
        }
        return result;
    }

}

