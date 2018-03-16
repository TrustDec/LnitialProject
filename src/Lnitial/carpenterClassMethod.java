package Lnitial;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class carpenterClassMethod {

    private static void Basis() {
        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");
        // 调用这两个对象的成员方法
        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("菜鸟程序员");
        empTwo.empSalary(500);
        empTwo.printEmployee();
        /* 创建对象 */
        Puppy myPuppy = new Puppy( "tommy" );
        /* 通过方法来设定age */
        myPuppy.setAge( 2 );
        /* 调用另一个方法获取age */
        myPuppy.getAge( );
        /*你也可以像下面这样访问成员变量 */
        System.out.println("变量值 : " + myPuppy.puppyAge );
        PrimitiveTypeTest primitive = new PrimitiveTypeTest();
        primitive.PrimitivePrint();
        ClassTypeConvert typeConvert = new ClassTypeConvert();
        typeConvert.TypeConvert();
        typeConvert.StrongTypeConvert();
        /* Java 修饰符 */
        Logger logger = new Logger();
        logger.setFormat("JIAGUORUI");
        System.out.println(logger.getFormat());
        InstanceCounter instanceCounter = new InstanceCounter();
        instanceCounter.InstanceCounterMain();
        /*break*/
        BreakSentence breakS = new BreakSentence();
        breakS.SeeBreak();
        /* Math */
        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));
        System.out.println("0度的余弦值：" + Math.cos(0));
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));
        System.out.println("1的反正切值： " + Math.atan(1));
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));
        System.out.println(Math.PI);
        char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        String string1 = helloString;
        System.out.println( helloString );
        helloString = "Trust";
        System.out.println( helloString );
        String string2 = helloString;
        System.out.println(string1.concat(string2));
        String s = "www.runoob.com";
        String s1 = "www.RUNOOB.com";
        String s2 = new String("www.RUNOOB.com");
        System.out.println(s.charAt(5));
        System.out.println(s.compareTo(s1));
        System.out.println(s.endsWith("coo"));
        System.out.println(s.equalsIgnoreCase(s1));
//        byte[] str1 = s2.getBytes("ISO-8859-1");
//        System.out.println(str1);
        String Str1 = new String("www.runoob.com");
        char[] Str2 = new char[2];
        try {
            Str1.getChars(4, 6, Str2, 0);
            System.out.print("拷贝的字符串为：" );
            System.out.println(Str2 );
        } catch( Exception ex) {
            System.out.println("触发异常...");
        }
        System.out.println(Str1.hashCode());
        System.out.println(Str1.indexOf("o",7));
        String str2 = new String("www.runoob.com");
        System.out.print("转义字符返回值 :" );
        for (String retval: str2.split("\\.", 3)){
            System.out.println(retval);
        }
        /*Java StringBuffer 和 StringBuilder 类*/
        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);
        //System.out.println(sBuffer.reverse());
        System.out.println(sBuffer.delete(5,12));
        System.out.println(sBuffer.insert(3,12));
        System.out.println(sBuffer.replace(3,12,"Trust"));
        System.out.println(sBuffer.capacity());
        /* 数组 */
        // 数组大小
        int size = 10;
        // 定义数组
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        // 计算所有元素的总和
        double total = 0;
        for (double p: myList){
            total+=p;
        }
        System.out.println(total);
        System.out.println(myList.length);
        System.out.println("myList".length());
        double[] myListOne = {1.9, 2.9, 3.4, 3.5};
        for (double p: myListOne) {
            System.out.println(p);
        }
        Date date = new Date();
        System.out.println(date.equals(date));
        System.out.println(date.getTime());
        System.out.println(date.toString());
        SimpleDateFormat ft = new SimpleDateFormat ("y-M-d-H-m-s-S-E-D-F-w-W");
        System.out.println("Current Date: " + ft.format(date));
        System.out.printf("%tF%n",date);
        try {
            System.out.println(new Date( ) + "\n");
            Thread.sleep(1000*3);   // 休眠3秒
            System.out.println(new Date( ) + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
        Calendar c1 = Calendar.getInstance();
        c1.set(2009, 6 - 1, 12);
        // 调用可变参数的方法
        PrintMax maxprint = new PrintMax();
        maxprint.printMax(34, 3, 3, 2, 56.5);
        maxprint.printMax(new double[]{1, 2, 3});
        maxprint.printMax();
        System.out.println("max(1,3)=========");
        System.out.println(maxprint.max(1,3));
        System.out.println(maxprint.max(1.3,3.5));
        ConsDemo consdemo = new ConsDemo();
        System.out.println(consdemo.x+consdemo.x);
    }

    public static void main(String[] args) throws IOException
    {
//        Basis();
        char c;
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
//            c = (char) br.readLine();
            str = br.readLine();
            System.out.println(str);
        } while(!str.equals("end"));
//        http://www.runoob.com/java/java-files-io.html
    }

}

