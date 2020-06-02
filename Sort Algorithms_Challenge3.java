package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        String[] stringsArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
        String[] stringsArray = {"bcdef", "abcqc", "abcde", "bbadd", "bbbbb"};
        int width = stringsArray[0].length();
        String[] temp = new String[stringsArray.length];
        System.arraycopy(stringsArray, 0, temp, 0, stringsArray.length);
        System.out.println("Temp last letters ------------------");

        System.out.println();
        System.out.println("----------------------");


        for (int position = width; position > 0; position--) {
            for (int i = 0; i < temp.length; i++) {

                System.out.print(temp[i].substring(position - 1, position) + ", ");

            }
            System.out.println();

            int lastUnsorted = temp.length;
            for (int j = 0; j < lastUnsorted; j++) {

                for (int i = 0; i < temp.length - 1; i++) {
                    String tempString = temp[i];

                    if (temp[i].substring(position - 1, position).compareTo(temp[i + 1].substring(position - 1, position)) > 0) {
                        temp[i] = temp[i + 1];
                        temp[i + 1] = tempString;
                        System.out.println(Arrays.toString(temp));

                    }
                }
            }
            System.out.println("Sorted position = " + position);
            System.out.println("Result of sort = " + Arrays.toString(temp));
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}