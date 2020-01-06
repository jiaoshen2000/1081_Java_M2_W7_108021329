import java.util.Scanner;

public class M2Q19 {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int j=1;
        for (int k=0;j<=n;k++){
            j=k+j;
            System.out.print(j+"\t");
        }
        System.out.println();
        for (int m=0;m<=n+1;m++){
            for (int s=1;s<=m;s++){
                System.out.print(m+"\t");
            }
        }
    }
}
