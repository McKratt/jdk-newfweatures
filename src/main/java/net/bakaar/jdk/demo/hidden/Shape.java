package net.bakaar.jdk.demo.hidden;

//tag::sealed[]
public abstract sealed class Shape
        permits net.bakaar.jdk.demo.hidden.Circle {

}
//end::sealed[]
