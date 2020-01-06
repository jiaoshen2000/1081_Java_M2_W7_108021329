import java.util.Scanner;

public class M2Q6 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        if (n==5){
            System.out.println("YES");
        }
        else if (n==2){
            System.out.println("YES");
        }
        else if (n%(n/2)==0){
            System.out.println("NO");
        }
        else if (n%2==0){
            System.out.println("NO");
        }
        else if (n%3==0){
            System.out.println("NO");
        }
        else if (n%5==0){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}
