package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Count {

    public static int count(String a, String b){

        Pattern pattern = Pattern.compile(b);
        Matcher m =pattern.matcher(a);
        int c=0;
        while (m.find())
            c++;
        return c;
    }
}
