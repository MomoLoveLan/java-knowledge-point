package com.momo.controller;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhanghui2018
 * @ClassName 取大于数组最大下标时报错处理
 * @Description
 * @date 2018/12/29 14:27
 */
public class ArrayAndMap {

    // 数组
    public static void myArray() {
        try {
            String[] str = new String[]{"a", "b"};
            System.out.println(str[2]);
        } catch (ArrayIndexOutOfBoundsException aiddfe) {
            System.out.println("aiddfe: 数组长度不够，");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        myArray();
    }
}
