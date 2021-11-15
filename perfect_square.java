package geekster;

import java.util.Scanner;

public class perfect_square {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int count_factor =0;
        for (int i=1;i<=x ;i++){
            if (x%i==0){
                count_factor+=1;
            }else{
                count_factor+=0;
            }
        }
        if (count_factor%2==0){
            System.out.println(" not perfect square");
        }else{
            System.out.println(" perfect square");
        }
    }
}
