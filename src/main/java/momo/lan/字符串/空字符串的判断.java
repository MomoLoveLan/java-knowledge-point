package momo.lan.字符串;

/**
 * @author zhanghui2018
 * @ClassName 空字符串的判断
 * @Description 1、null可以  str==null   null==str
 * 2、""!=null  null!=""
 * 3、str==null时  不能用str.equals("abc")方法  一般情况下，将可以确定不为空的值放在前面
 * 4、str!=null时  equals方法  （）中的值为null时  返回true
 * @date 2018/12/29 17:27
 */
public class 空字符串的判断 {
    public static void main(String[] args) {
        String a = null;//没有分配内存
        String b = "";//没有分配内存
        if (a == null) {
            System.out.println("a==null");
        }
        if (null == a) {
            System.out.println("null==a");
        }
        if ("" != null) {
            System.out.println("''!=null");
        }

        try {
            // a=null  此处不能用equals方法
            if (a.equals(null)) {
                System.out.println("a.equals(null)打印了");
            }
        } catch (NullPointerException e) {
            System.out.println("a.equals(null),报NullPointerException");
        }
        if (b.equals(null)) {
            System.out.println("b.equals(null)打印了");
        } else {
            System.out.println("b.equals(null) ==> ''!=null");
        }
        try {
        } catch (NullPointerException e) {
            System.out.println("b.equals(null),报NullPointerException");
        }
        if (b == "") {
            System.out.println(" '' 可以 == 来比较");
        }
    }
}
