package java8.templet.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by wushuangxiaoyu on 2017/11/13.
 */
public class TestDemo<T> {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers = filter(integers,(integer -> integer>3));
        for (Integer integer : integers){
            System.out.println(integer);
        }

    }

    //cd /opt/logs/mobile/
    public static<T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<>();
        for(T t : list){
            if (p.test(t)){
                result.add(t);
            }
        }
        return result;
    }

}
