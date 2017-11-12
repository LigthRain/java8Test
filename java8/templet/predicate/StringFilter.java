package java8.templet.predicate;

import java8.predicate.predicate.Predicate;

import java.util.ArrayList;
import java.util.List;

/**
 * designed by LightRain
 *
 * @author LightRain
 * e-mail wsxy0711@163.com
 * github https://github.com/LigthRain
 * @version JDK 1.8.0_101
 * @describe
 * @since 2017/10/17
 */
public class StringFilter<T> {

    public static <T> List<T> filterStrings(List<T> inventory, Predicate<T> p){
        List<T> result = new ArrayList<>();
        for (T t  : inventory){
            if(p.test(t)){
                result.add(t);
            }
        }
        return result;
    }

}
