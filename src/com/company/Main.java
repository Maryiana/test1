package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String a = "stringdfsfsdfA";
        String b = "dfsdfssdfsdfdfasdf";
        String c = "asdfassdfsdfsdfasdf";
        String d = "sdafsdfasdfsdfdfaf";
        List<String> listOfStrings;
        listOfStrings = new ArrayList<>();

        listOfStrings.add(a);
        listOfStrings.add(b);
        listOfStrings.add(c);
        listOfStrings.add(d);
        printOurList(listOfStrings);

    }

    public static void printOurList(List listOfStrings) {

        for(int i =0; i<listOfStrings.size() ;i++) {

            System.out.println(listOfStrings.get(i));

        }

    }
}
