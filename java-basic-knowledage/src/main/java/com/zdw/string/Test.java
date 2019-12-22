package com.zdw.string;

public class Test {
    public String name;

    public Test(String name){
        this.name = name;
    }


    public static void main(String[] args) {
        Test test = new Test("david"+(""+("")));
        System.out.println(test.name);
    }
}
