import java.util.Scanner;

public class M2Q26 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int drink=scn.nextInt();
        int em=drink;
        while (em>=3){
            drink=drink+em/3;
            em=em/3+em%3;
        }
        System.out.println(drink);
    }
}
