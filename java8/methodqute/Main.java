package java8.methodqute;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
public class Main {

    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        scanner.nextLine();
        String temp = "";
        int max = 0;
        for (int i = 0; i < count; i++){
            temp = scanner.nextInt()+"";
            char[] chars = temp.toCharArray();
            List<String> stringlist = new ArrayList<>();
            for(int j = 0; j < chars.length; j++){
                stringlist.add(chars[j]+"");
            }
            stringlist.sort(String::compareToIgnoreCase);
            String tempStr = "";
            for(int k = 0; k < stringlist.size(); k++){
                tempStr+=stringlist.get(k);
            }
            int tempValue = Integer.parseInt(tempStr);
            if(tempValue > max){
                max = tempValue;
            }
        }
        System.out.println(max);
    }

}
