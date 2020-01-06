import java.util.Scanner;

public class M2Q8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int num=0;
        for (int i=1;i<=n;i++){
            if (i%3==0){
                num=num+i;
            }
            else {
                num=num+0;
            }
        }
        System.out.println(num);
    }
}
