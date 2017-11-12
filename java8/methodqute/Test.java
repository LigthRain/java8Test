package java8.methodqute;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
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
 * @since 2017/10/28
 */
public class Test {

    public static void main(String[] args) {
        ToIgnoreCase();
        System.out.println("=======");
        ToIgnoreMethodQute();
    }

    //忽略大小写对list排序
    public static void ToIgnoreCase(){
        List<String> list = Arrays.asList("a","C","B","d");
        list.sort((s1,s2)->s1.compareToIgnoreCase(s2) );
        for (String s : list){
            System.out.println(s);
        }
    }

    //忽略大小写对list排序 方法引用
    public static void ToIgnoreMethodQute(){
        List<String> list = Arrays.asList("a","C","B","d");
        list.sort(String::compareToIgnoreCase);
        for (String s : list){
            System.out.println(s);
        }
    }

}
