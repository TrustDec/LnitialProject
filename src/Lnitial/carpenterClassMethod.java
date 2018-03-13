package Lnitial;

public class carpenterClassMethod {

    public static void main(String[] args)
    {
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
    }
}

