package java8.templet.consumer;

import java.util.Arrays;

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
public class ConsumerRunClass {

    public static void main(String[] args) {
        ConsumerForEach.forEach(Arrays.asList(1,2,3,4,5),integer -> System.out.println(integer));
        ConsumerForEach.forEach(Arrays.asList(1,2,3,4,5),integer -> System.out.println(integer+5));
    }

}
