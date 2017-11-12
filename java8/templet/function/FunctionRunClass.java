package java8.templet.function;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;

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
public class FunctionRunClass {

    public static void main(String[] args) {
        List<Integer> list = FunctionApply.map(Arrays.asList("a","aa","aaa"),(String s) -> s.length() );
        for (Integer integer : list){
            System.out.println(integer);
        }
    }

}
