import java.util.Scanner;

public class M2Q1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float num = scn.nextFloat();
        float max= num;
        float min=num;
        for (int i=1;i<10;i++){
           num = scn.nextFloat();
           if (num>max){
               max=num;
           }
           if (num<min){
               min=num;
           }
        }
        System.out.printf("max=%.2f\n",max);
        System.out.printf("min=%.2f\n",min);
    }
}
