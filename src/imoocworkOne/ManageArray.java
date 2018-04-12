package imoocworkOne;

import java.util.Scanner;

public class ManageArray {
    public int length = 9;
    public int[] arr = new int[length + 1];

    // 插入数据
    public int[] insertData() {
        Scanner s = new Scanner(System.in);
        System.out.println("已设置默认数组长度为：" + (length + 1));
        for (int i = 0; i < length; i++) {
            System.out.println("请输入第个" + (i + 1) + "数据");
            int n = s.nextInt();
            arr[i] = n;
        }
        return arr;
    }

    // 显示所有数据
    public void showData(int[] a, int length) {
        System.out.print("显示数组内所有数据");
        for (int i = 0; i < length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }

    // 在指定位置插入数据
    public void insertAtArray(int[] a, int n, int k) {
        if (a.length - 1 < k) {
            Scanner s = new Scanner(System.in);
            System.out.println("你输入的索引数超出当前数组的索引长度, 请重新输入：");
            int index = s.nextInt();
            insertAtArray(a, n, index);
            return;
        }
        a[k] = n;
        showData(a, a.length);
    }

    // 查询能被3整除的数据
    public void divThree(int[] a) {
        System.out.print("能被3整除的数有：");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    //显示提示信息的方法
    public void notice() {
        System.out.println("********************************");
        System.out.println("            1--插入数据");
        System.out.println("            2--显示所有数据");
        System.out.println("            3--在指定位置插入数据");
        System.out.println("            4--查询能被3整除的数据");
        System.out.println("            0--退出");
        System.out.println("********************************");
        System.out.println("请输入对应的数字进行操作：");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        switch (n) {
            case 1:
                arr = insertData();
                notice();
                break;
            case 2:
                showData(arr, length);
                notice();
                break;
            case 3:
                System.out.println("请输入要插入的值");
                int value = s.nextInt();
                System.out.println("请输入要插入的位置，按索引输入");
                int index = s.nextInt();

                insertAtArray(arr, value, index);
                notice();
                break;
            case 4:
                divThree(arr);
                notice();
                break;
            default:
                System.out.println("已退出");
                return;
        }
    }

    public static void main(String[] args) {
        ManageArray manage = new ManageArray();
        //manage.notice();
        int m =3,n=6,k=0;

        while((m++)<(--n))++k;
        System.out.println(k);
        int a=13;
        a%=a/5;
        System.out.println(a);
    }
}
