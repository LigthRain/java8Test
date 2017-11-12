package java8;

/**
 * designed by LightRain
 *
 * @author LightRain
 * e-mail wsxy0711@163.com
 * github https://github.com/LigthRain
 * @version JDK 1.8.0_101
 * @describe
 * @since 2017/9/28
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }
        sort(a, b);
        int min = p;
        int i = a.length - 1;
        while (i>-1){
            while (p - a[i] > -1) {
                p -= a[i];
                b[i]--;
                if (p == 0) {
                    System.out.println(0);
                    return;
                }
            }
            min = Math.min(p, min);
            i--;
        }

        System.out.println(p);
    }

    public static void sort(int[] a, int[] b) {
        for (int i = 0; i < a.length - 1; i++) {
            int k = i;
            for (int j = k + 1; j < a.length; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            if (i != k) {
                int temp = a[i];
                a[i] = a[k];
                a[k] = temp;
                temp = b[i];
                b[i] = b[k];
                b[k] = temp;
            }
        }
    }

}
