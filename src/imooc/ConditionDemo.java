package imooc;

import java.util.Scanner;

public class ConditionDemo {
    public static void main(String[] args) {
        int a = 5,b=4,c=3,d=2;
        if (a>b&&b>c){
            System.out.println(d);
        }else if ((c-1>=d)==false){
            System.out.println(d+1);
        }else{
            System.out.println(d+2);
        }
        System.out.println("请输入一个整数");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n%2 == 0)
        {
            System.out.println(n+"是偶数");
        }else{
            System.out.println(n+"是奇数");
        }
    }
}
