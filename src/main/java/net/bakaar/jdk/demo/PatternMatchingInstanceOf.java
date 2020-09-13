package net.bakaar.jdk.demo;

public class PatternMatchingInstanceOf {

    private void before(Object obj) {
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s.length());
        }
    }

    private void after(Object obj) {
        if (obj instanceof String s) {
            System.out.println(s.length());
        }
    }
}
