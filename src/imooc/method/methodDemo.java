package imooc.method;

public class methodDemo {
    public void printStar(){
        System.out.println("******************************");
        System.out.println("欢迎来到JAVA的世界");
        System.out.println("******************************");
    }
    public int area(){
        int length = 10;
        int width = 5;
        int getArea = length * width;
        return getArea;
    }
    public void max(float a,float b){
        float max;
        if (a>b){
            max = a;
        }else{
            max = b;
        }
        System.out.println(max);
    }
    public double num(int jiage){
        if (jiage>200){
            return jiage*0.85;
        }else if(jiage>100&&jiage<199){
            return jiage*0.95;
        }else{
            return jiage*1;
        }
    }
    public int fac(int n){
        int s = 1;
        for (int t = 1;t<=n;t++){
            s*=t;
        }
        return s;
    }
    public void Average(float[] f){
        float sum = 0;
        for(float i:f){
            sum+=i;
        }
        System.out.println("平均数："+sum/f.length);
    }
    public boolean search(float n,float[] arr){
        boolean flag = false;
        for (float i:arr){
            if (i == n){
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        methodDemo myMethod = new methodDemo();
        myMethod.printStar();
        System.out.println(myMethod.area());
        myMethod.max(11,1);
        int sum = 150;
        System.out.println(myMethod.num(sum));
        int fac = myMethod.fac(5);
        System.out.println(fac);
        int sumNum = 0;
        for (int i = 1;i<=5;i++){
            fac = myMethod.fac(i);
            sumNum += fac;
        }
        System.out.println(sumNum);
        float[] f = {78.5f,98.5f,65.5f,32.5f,75.5f};
        myMethod.Average(f);
        System.out.println(myMethod.search(32.5f,f));
    }
}
