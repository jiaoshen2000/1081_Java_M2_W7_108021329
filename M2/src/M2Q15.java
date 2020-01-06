import java.util.Scanner;

public class M2Q15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double sum =0;
        for (int i=1;i<=n;i++){
            sum=(double)1/((2*i-1)*(2*i))+sum;
        }
        System.out.println(sum);
    }
}
//M2Q15. 1/[(2n-1)*(2n)]總和