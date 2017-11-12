package java8.predicate.Apple;

/**
 * designed by LightRain
 *
 * @author LightRain
 * e-mail wsxy0711@163.com
 * github https://github.com/LigthRain
 * @version JDK 1.8.0_101
 * @describe
 * @since 2017/10/10
 */
public class AppleColorPredicate implements ApplePredicate {
    @Override
    public boolean filter(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
