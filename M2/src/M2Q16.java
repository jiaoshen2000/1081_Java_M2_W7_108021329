import java.util.Scanner;

public class M2Q16 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int num=0;
        int m=1,i=1;
        for (int k=1;k<=n;k++) {
            while (i==k) {
                m = m * 2;
                i++;
                num = num + m;
            }
        }
        System.out.println(num);
    }
}
