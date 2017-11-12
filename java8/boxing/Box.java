package java8.boxing;


import java.util.function.Predicate;

/**
 * designed by LightRain
 *
 * @author LightRain
 * e-mail wsxy0711@163.com
 * github https://github.com/LigthRain
 * @version JDK 1.8.0_101
 * @describe
 * @since 2017/10/19
 */
public class Box {

    public static void main(String[] args) {
        System.out.println("To avoid 自动拆装箱带来的性能损耗");
        IntPredicate evenNumbers = (int i)-> i % 2 == 0;
        System.out.println(evenNumbers.test(1000));

        System.out.println("Predicate<Integer> 拆装箱");
        Predicate<Integer> oddNumbers = (Integer i) -> i % 2 == 1;
        System.out.println(oddNumbers.test(101));
    }

}
