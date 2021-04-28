package com.SetApp;

public class Main {

    public static void main(String[] args) {
//        int[] a={5,15,23,12,11};
//        int bigger=0;
//        for(int number:a){
//            if (number==12){
//                continue;
//            }
//            if (bigger<number){
//                bigger=number;
//            }
//
//            System.out.println(number);
//
//        }
//        System.out.println(bigger);
//
//
//        String d = "hi";
//        String s ="hi bro";
//        System.out.println(d.length());
//        System.out.println(s.length());
//
//        int v = 1234;
//        System.out.println("-----------------------------------");
//        System.out.println(v%10);
//        System.out.println(v/10%10);
//        System.out.println(v/100%10);
//        System.out.println(v/1000%10);
//



        int[][] p={{1,6,3},{18,24,12},{55,101,12},{31,12,1}};
        int topBig = 0;
        for (int i = 0; i < p.length; i++) {
            int[] inner = p[i];
            int big = 0;
            for (int j = 0; j < inner.length; j++) {
if (big<inner[j]){
    big=inner[j];
}
            }
            if (topBig<big){
                topBig=big;
            }
            System.out.println(big);

        }
        System.out.println(topBig);
    }                                                                               
}
