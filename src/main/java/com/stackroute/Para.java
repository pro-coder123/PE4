package com.stackroute;

import java.util.Arrays;

public class Para {


    public static String[] sort(){

        String s = "hello world this is my para";
        String[] res = s.split(" ",-1);

        Arrays.sort(res);
        return res;

    }

}
