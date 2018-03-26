package imooc;

import java.util.Scanner;

public class GuessDemo {
    public static void main(String[] args){
//        int number =(int)(Math.random()*10+1);
//        System.out.println(number);
//        int guess;
//        System.out.println("才一个介于1～10之间的数");
//        do{
//            System.out.println("请输入您猜测的数");
//            Scanner sc = new Scanner(System.in);
//            guess = sc.nextInt();
//            if (guess>number){
//                System.out.println("太大");
//            }else if (guess<number){
//                System.out.println("太小");
//            }
//        }while (number!=guess);
//        System.out.println("中了");
        int intArray[][]  = new int[3][2];
        int yw = 0,ywP=0,sx=0,sxP=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("才一个介于1～10之间的数");
        for(int i = 0;i<intArray.length;i++){
            for(int j = 0;j<intArray[i].length;j++){
                String str = j==0?"语文":"数学";
                System.out.println("输入第"+(i+1)+"个学生的"+str+"成绩");
                intArray[i][j]=sc.nextInt();
                yw += (j==0?intArray[i][j]:0);
                sx += (j!=0?intArray[i][j]:0);
            }
        }
        System.out.println("语文的总成绩:"+yw);
        System.out.println("语文的平均分:"+(yw/3));
        System.out.println("数学的总成绩:"+sx);
        System.out.println("数学的平均分:"+(sx/3));
    }
}
