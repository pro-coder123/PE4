package com.stackroute;

public class Occurrences {

    public static int count(String s, char a)
    {
        return s.length() - s.replaceAll(String.valueOf(a),"").length();
    }
}
