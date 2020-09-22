package net.bakaar.jdk.demo;

public class PatternMatchingInstanceOf {
    private void before(Object obj) {
        //tag::patMatchBefore[]
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s.length());
        }
        //end::patMatchBefore[]
    }

    private void after(Object obj) {
        //tag::patMatchAfter[]
        if (obj instanceof String s) {
            System.out.println(s.length());
        }
        //end::patMatchAfter[]
    }
}
