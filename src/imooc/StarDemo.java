package imooc;

public class StarDemo {
    public static void main(String[] args){
        int N=8;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = N; i>0; i--){
            for (int j = N-i;j>0;j--){
                System.out.print(" ");
            }
            for (int j = 2*i+1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
