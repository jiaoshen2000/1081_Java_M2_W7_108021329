import java.util.Scanner;

public class M2Q14 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int num=0;
        for (int i=1;i<=n;i++) {
            num = num+i * (i + 1);
        }
        System.out.println(num);
    }
}
