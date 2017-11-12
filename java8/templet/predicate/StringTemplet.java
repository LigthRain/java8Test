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
public class StringTemplet {

    public static void main(String[] args) {
        Predicate<String> notEmptyStringPredicate = (String s) -> !s.isEmpty();
        List<String> inventory = new ArrayList<>();
        inventory.add("");
        inventory.add("first");
        inventory.add("");
        inventory.add("second");
        List<String> result = StringFilter.filterStrings(inventory,notEmptyStringPredicate);
        for (String s : result){
            System.out.println(s);
        }
    }

}
