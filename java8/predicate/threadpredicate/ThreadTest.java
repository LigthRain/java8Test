package java8.predicate.threadpredicate;

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
public class ThreadTest {

    public static void main(String[] args) {
        Thread thread = new Thread(()-> System.out.println("hello world"));
        thread.run();
    }

}
