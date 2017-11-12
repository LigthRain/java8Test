package java8.predicate.predicate;

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
 * @since 2017/10/15
 */
public class Filter<T> {

    public static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList();
        for (T t : list){
            if(p.test(t)){
                result.add(t);
            }
        }
        return result;
    }

}
