package java8.predicate.Apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
public class RunClass {

    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple("red",200));
        inventory.add(new Apple("green",100));
        inventory.add(new Apple("red",151));
        inventory.add(new Apple("green",120));
        inventory.sort((Apple a1,Apple a2) -> a1.getWeight() - a2.getWeight());
        inventory.sort(Comparator.comparing(Apple::getWeight));
        List<Apple> result = null;
        result = Apple.filterApples(inventory,new AppleWeightPredicate());
        System.out.println("行为参数化，实现接口，传递类");
        for (Apple apple : result){
            System.out.print(apple);
        }
        System.out.println();
        // Q:
        // the following tow statement
        // which one is right?
        // or both right?

        // A: both right
        result = Apple.filterApples(inventory,(Apple apple) -> "red".equals(apple.getColor()));
        System.out.println("Lambda表达式第一种类型");
        for (Apple apple : result){
            System.out.print(apple);
        }
        System.out.println();
        result = Apple.filterApples(inventory,apple -> "red".equals(apple.getColor()));
        System.out.println("Lambda表达式第二种类型");
        for (Apple apple : result){
            System.out.print(apple);
        }
        System.out.println();
    }

}
