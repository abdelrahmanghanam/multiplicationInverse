package com.company;


public class Main {

    public static void main(String[] args) {
        System.out.println(multiply(23,12321));


    }

    public static long multiply(long a, long b){
        long len = Long.toString(a).length();
        if(len == 1) {
            return a * b;
        }
        long mid=len/2;
        long power = (long) Math.pow(10, len/2);

        long al = a / power;
        long ar = a % power;
        long bl = b / power;
        long br = b % power;

        long c2 = multiply(al, bl);
        long c0 = multiply(ar, br);
        long c1 = multiply(al+ar, bl+br) - c2 - c0;


        return (long) (c2*(long) Math.pow(10, 2*(len/2)) + c1*Math.pow(10, len/2) + c0);
    }


}

