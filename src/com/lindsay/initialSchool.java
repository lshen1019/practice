package com.lindsay;

/**
 * Created by shenlingxin on 15/3/6.
 */
public class initialSchool {
    public static void main(String[] args){
        School mySchool = new School();

        mySchool.setHistory(80);
        mySchool.setArea(70.6f);

        System.out.println("这个学校的历史有"+mySchool.getHistory()+"年；");
        System.out.println("这个学校的面积有"+mySchool.getArea()+"亩。");
    }

}
