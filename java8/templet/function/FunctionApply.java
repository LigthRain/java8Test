package java8.templet.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * designed by LightRain
 *
 * @author LightRain
 * e-mail wsxy0711@163.com
 * github https://github.com/LigthRain
 * @version JDK 1.8.0_101
 * @describe
 * @since 2017/10/18
 */
public class FunctionApply<T, R> {

    public static <T, R> List<R> map(List<T> list, Function<T, R> f){
        List<R> result = new ArrayList<>();
        for (T t : list){
            result.add(f.apply(t));
        }
        return result;
    }

}
