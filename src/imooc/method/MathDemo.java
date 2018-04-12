package imooc.method;

public class MathDemo {
    //求圆形面积
    public double num(double r){
        double S = Math.PI*r*r;
        return S;
    }
    //求长方形面积
    public double num(double C,double W){
        return C*W;
    }
    // 求两个int类型数的和
    public int plus(int m,int n) {
        return m+n;
    }
    // 求两个double类型数的和
    public double plus(double m,double n){
        return m+n;
    }
    // 求数组元素累加和
    public int plus(int[] arr){
        int sum = 0;
        for (int i = 0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public void ShuChu (){
        int m = 5,n=10;
        int[] arr = {1,2,3,4,5,6};
        System.out.println("int类型的和："+plus(m,n));
        System.out.println("double类型的和："+plus(5.6,7.8));
        System.out.println("数组元素累加和："+plus(arr));
        System.out.println("圆形面积:"+num(4.5));
        System.out.println("长方形面积:"+num(8,5));
    }
    public String KeBianCanShu(int n,int... a){
        boolean state = false;
        for (int a1:a){
            if (a1==n){
                state=true;
                break;
            }
        }
        return state?"找到了"+n:"没有找到"+n;
    }
    public static void main(String[] args) {
        MathDemo math = new MathDemo();
        math.ShuChu();
        int[] arr = {1,2,3,4,5,6,7,8,9,12};
        System.out.println(math.KeBianCanShu(12,arr));
    }
}
