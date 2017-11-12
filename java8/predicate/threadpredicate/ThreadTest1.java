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
public class ThreadTest1 {

    public static void main(String[] args) {
        Runnable r1 = ()-> System.out.println("hello world1");
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world2");
            }
        };
        process(r1);
        process(r2);
        process(()-> System.out.println("hello world3"));
    }

    public static void process(Runnable runnable){
        runnable.run();
    }

}
