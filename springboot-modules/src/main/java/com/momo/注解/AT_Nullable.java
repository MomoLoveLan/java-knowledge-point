package com.momo.注解;

import com.sun.istack.internal.NotNull;

/**
 * @author zhanghui2018
 * @ClassName AT_Nullable
 * @Description
 * @date 2019/1/2 16:06
 */
public class AT_Nullable {
    public static void main(String[] args) {
        System.out.println(nullable_a(null));
        System.out.println(nullable_a("sss"));
        System.out.println(nullable_b(null));
        System.out.println(nullable_b("sss"));
    }

    public static String nullable_a(String method) {
        return method != null ? method + "不等于null" : method + "==null";
    }

    public static String nullable_b(@NotNull String method) {
        return method != null ? method + "不等于null" : method + "==null";
    }
}
