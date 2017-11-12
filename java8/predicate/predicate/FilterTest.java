package java8.predicate.predicate;

import java8.predicate.Apple.Apple;

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
 * @since 2017/10/15
 */
public class FilterTest {

    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple("red",100));
        inventory.add(new Apple("green",130));
        inventory.add(new Apple("red",90));
        inventory.add(new Apple("green",159));
        inventory.add(new Apple("red",145));
        System.out.println("苹果Lambda筛选");
        List<Apple> appleList = Filter.filter(inventory,apple -> "red".equals(apple.getColor()));
        for (Apple apple : appleList){
            System.out.println(apple);
        }
        System.out.println();
        System.out.println("Integer Lambda筛选");
        List<Integer> numlist = new ArrayList<>();
        numlist.add(1);
        numlist.add(2);
        numlist.add(3);
        numlist.add(4);
        numlist.add(5);
        numlist.add(6);
        List<Integer> integers = Filter.filter(numlist,integer -> integer%2 == 0);
        for (Integer integer : integers){
            System.out.println(integer+" ");
        }
        System.out.println("Comparator实践");
//        inventory.sort((Apple apple1,Apple apple2)->apple1.getWeight()-apple2.getWeight());
        inventory.sort(Comparator.comparingInt(Apple::getWeight));
        for (Apple apple : inventory){
            System.out.println(apple);
        }
    }

}
