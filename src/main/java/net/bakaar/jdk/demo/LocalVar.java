package net.bakaar.jdk.demo;

import java.util.ArrayList;
import java.util.List;

class LocalVar {
    //tag::varBefore[]
    private void localVarBefore11() {
        List<String> myList = new ArrayList<>();
        for (String myString : myList) {
            System.out.println(myString);
        }
    }
    //end::varBefore[]

    //tag::varAfter[]
    private void localVarAfter11() {
        var myList = new ArrayList<String>();
        for (var myString : myList) {
            System.out.println(myString);
        }
    }
    //end::varAfter[]
}