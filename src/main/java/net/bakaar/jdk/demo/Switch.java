package net.bakaar.jdk.demo;

import java.time.DayOfWeek;

public class Switch {

    private void switchBefore14(DayOfWeek day) {
        //tag::switchBefore[]
        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                System.out.println(6);
                break;
            case TUESDAY:
                System.out.println(7);
                break;
            case THURSDAY:
            case SATURDAY:
                System.out.println(8);
                break;
            case WEDNESDAY:
                System.out.println(9);
                break;
        }
        //end::switchBefore[]
    }


    private void switchAfter14(DayOfWeek day) {
        //tag::switchAfterYield[]
        System.out.println(switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                yield 6;
            case TUESDAY:
                yield 7;
            case THURSDAY:
            case SATURDAY:
                yield 8;
            case WEDNESDAY:
                yield 9;
        });
        //end::switchAfterYield[]

        //tag::switchAfterArrow[]
        System.out.println(switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
        });
        //end::switchAfterArrow[]
    }
}
