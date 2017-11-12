package java8.local;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

/**
 * designed by LightRain
 *
 * @author LightRain
 * e-mail wsxy0711@163.com
 * github https://github.com/LigthRain
 * @version JDK 1.8.0_101
 * @describe
 * @since 2017/10/25
 */

/**
 * Lambda表达式只能捕获被final修饰的或者实际上是final的局部变量
 * 但是可以没有限制的捕获实例变量或者静态变量
 */
public class LocalRunClass {

    static int local1 = 4;

    public static void main(String[] args) {
        int local = 5;
        Runnable r = ()-> System.out.println(local);
//        local = 4;
        Runnable r1 = ()-> System.out.println(local1);
        r.run();
        r1.run();
        local1 = 5;
    }

}
