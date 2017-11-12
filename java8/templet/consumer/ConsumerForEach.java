package java8.templet.consumer;

import java.util.List;
import java.util.function.Consumer;

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
public class ConsumerForEach<T> {

    public static <T> void forEach(List<T> integers, Consumer<T> p){
        for (T t : integers){
            p.accept(t);
        }
    }

}
