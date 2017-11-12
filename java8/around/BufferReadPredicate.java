package java8.around;

import java.io.BufferedReader;
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
 * 第1、2步
 * 设计Lambda表达式，并编写谓词，抽象方法的参数应与Lambda表达式的参数相同
 */
public interface BufferReadPredicate {

    /**
     * @param br
     * @return
     * @throws IOException
     */
    String readPredicate(BufferedReader br) throws IOException;

}
