package java8.around;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * designed by LightRain
 *
 * @author LightRain
 * e-mail wsxy0711@163.com
 * github https://github.com/LigthRain
 * @version JDK 1.8.0_101
 * @describe
 * @since 2017/10/16
 */

/**
 * 第3步
 * 编写接收Lambda表达式的方法
 */
public class BufferReadProcess {

    public static String process(BufferReadPredicate p) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("F:\\java8测试文件\\test.txt"))){
            return p.readPredicate(br);
        }
    }

}
