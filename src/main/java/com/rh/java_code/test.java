package com.rh.java_code;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test {
    @Test//day01_arraylist
    public void test(){
        List<String> list = new ArrayList<>();
        list.add("name");
        list.add("age");
        list.add("gander");
        list.add("score");
        for (String lists:list) {
            System.out.println(lists);
        }
    }
    public void test2(){

    }
}
