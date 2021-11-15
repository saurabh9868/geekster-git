package geekster;

import java.util.Scanner;

public class find_total_digit_in_number {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int count_digit=0;
        while(num!=0){
            num=num/10;
            count_digit+=1;
        }
        System.out.println("the total number of digits are :" + count_digit);
    }
}
