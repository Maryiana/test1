package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String a = "testtesttest";
        String b = "dfsdfsdfasdf";
        String c = "asdfasdfasdf";
        String d = "sdafsdfadfaf";
        List<String> listOfStrings;
        listOfStrings = new ArrayList<>();

        listOfStrings.add(a);
        listOfStrings.add(b);
        listOfStrings.add(c);
        listOfStrings.add(d);

        for(int i =0; i<listOfStrings.size() ;i++) {

            System.out.println(listOfStrings.get(i));

        }

    }
}
