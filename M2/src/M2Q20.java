import java.util.Scanner;

public class M2Q20 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 2; i < n; i++) {
            if (i==2){
                System.out.println(i);
            }
            else if (i==3){
                System.out.println(i);
            }
            else if ((double)i%2==0){
                break;
            }
            else if ((double)i%3==0){
                break;
            }
            else if ((double)i%5==0){
                break;
            }
            else {
                System.out.println(i);
            }
        }
    }
}
