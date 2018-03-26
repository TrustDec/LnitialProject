package imooc;

import java.util.Scanner;

public class GuessDemo {
    public static void main(String[] args){
        int number =(int)(Math.random()*10+1);
        System.out.println(number);
        int guess;
        System.out.println("才一个介于1～10之间的数");
        do{
            System.out.println("请输入您猜测的数");
            Scanner sc = new Scanner(System.in);
            guess = sc.nextInt();
            if (guess>number){
                System.out.println("太大");
            }else if (guess<number){
                System.out.println("太小");
            }
        }while (number!=guess);
        System.out.println("中了");
    }
}
