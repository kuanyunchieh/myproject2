package com.kuan.ticket2;

public class Station2 {
    public static final Station2 TAIPEI_CITY =
            new Station2(100, "Taipei");
    public static final Station2 TAICHUNG =
            new Station2(200, "Taichung");
    public static final Station2 KAOHSIUNG =
            new Station2(400, "Kaohsing");
    int id;
    String name;
    public Station2(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
