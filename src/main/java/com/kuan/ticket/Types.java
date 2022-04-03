package com.kuan.ticket;

public class Types {
    public static final Types Normal = new Types("Normal");
    public static final Types Student = new Types("Student");
    public static final Types Older = new Types("Older  ");
    public static final Types RoundTrip = new Types("RoundTrip");

    String types;
    public Types(String type){
        this.types = type;
    }
}
