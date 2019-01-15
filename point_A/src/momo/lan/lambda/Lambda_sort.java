package momo.lan.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @program: java-knowledge-point
 * @description: 使用匿名内部类根据name排序players
 * @author: zhanghui2018
 * @create: 2019-01-15 11:05
 */
public class Lambda_sort {
    public static void main(String[] args) {
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer", "Roger Federer",
                "Andy Murray", "Tomas Berdych",
                "Juan Martin Del Potro"};
        // 1.1 使用匿名内部类根据 name 排序 players
        Arrays.sort(atp, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            }
        });
        Arrays.asList(atp).forEach((arr) ->System.out.println(arr));

        // 1.2 使用 lambda expression 排序 players
        Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));
        Arrays.sort(atp, sortByName);
        Arrays.asList(atp).forEach((arr) ->System.out.println(arr));

        // 1.3 也可以采用如下形式:
        Arrays.sort(atp, (String s1, String s2) -> (s1.compareTo(s2)));
        Arrays.asList(atp).forEach((arr) ->System.out.println(arr));
    }
}
