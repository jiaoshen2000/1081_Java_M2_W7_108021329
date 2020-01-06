import java.util.Scanner;

public class M2Q24 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int k=0,i=1;
        while (k<=n){
            k=k+i;
            i++;
        }
        System.out.println(i-2);
    }
}
