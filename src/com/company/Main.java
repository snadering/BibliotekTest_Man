package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String result = getString("123TEST");
        System.out.println(result);
    }

    public static String getString(String s){

        Scanner scn = new Scanner(System.in);

        System.out.print(s + " : ");
        return scn.nextLine();
    }

}
