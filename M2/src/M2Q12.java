import java.util.Scanner;

public class M2Q12 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String c = scn.next();
        for (int i=1;i<=n;i++){
            for (int j=1;j<n;j++){
                System.out.print(c);
            }
            System.out.print(c);
            System.out.println();
        }
    }
}
