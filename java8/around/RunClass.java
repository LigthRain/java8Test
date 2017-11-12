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
 * 第4步
 * 根据实际业务，传递相应的Lambda表达式
 */
public class RunClass {

    public static void main(String[] args) {
        try {
            System.out.println(BufferReadProcess.process((BufferedReader br)->br.readLine()+"\n"+br.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
