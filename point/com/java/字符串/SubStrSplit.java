package com.java.字符串;

/**
 * @author zhanghui2018
 * @ClassName SubStrSplit
 * @Description   split
 * @date 2018/12/29 15:05
 */
public class SubStrSplit {
    public static void main(String[] args) {
        int code = 1;
        String string = "8000!DX!aaa#2.0#002#你好啊";
        String str = string;
        code = Integer.parseInt(string.split("!DX!")[0]);
        str = string.split("!DX!")[1];
        System.out.println(code+str);
        String sCode = ("" + code);
        System.out.println(sCode);
        if (sCode.contains("8000")) {
            str = "请检查手机号、运营商等信息";
        } else if (sCode.contains("800")) {
            str = str.split("#")[3];
            System.out.println("a");
        } else {
            str = "接口优化,敬请稍后重试！";
        }

        // result：8000aaa#2.0#002#你好啊
        //         8000
    }
}
