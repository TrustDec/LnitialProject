package imoocObject;

class Code{
    //创建外部类Code构造块（构造块）
    {
        System.out.println("外部类Code构造块");
    }

    //创建外部类Code静态代码块（静态代码块）
    static {
        System.out.println("外部类Code静态代码块");
    }

    //创建外部类Code构造方法（构造方法）
    public Code(){
        System.out.println("外部类Code构造方法");
    }
}