package imoocObject;

public class Book {
    //私有属性：书名、作者、出版社、价格
    private String name = "";
    private String zuozhe = "";
    private String chubanshe = "";
    private double jiage = 0;
    //通过构造方法实现属性赋值
    public Book(String name,String zuozhe,String chubanshe,double jiage) {
        this.setName(name);
        this.setZuozhe(zuozhe);
        this.setChubanshe(chubanshe);
        this.setJiage(jiage);
    }
    /*通过公有的get/set方法实现属性的访问，其中：
    1、限定图书价格必须大于10，如果无效需进行提示，并强制赋值为10
    2、限定作者、书名均为只读属性
    */

    private void setName(String name) {
        this.name = name;
    }

    private void setZuozhe(String zuozhe) {
        this.zuozhe = zuozhe;
    }

    private void setChubanshe(String chubanshe) {
        this.chubanshe = chubanshe;
    }

    private void setJiage(double jiage) {
        if (jiage>=10){
            this.jiage = jiage;
            return;
        }
        this.jiage = 10;

    }
    //信息介绍方法，描述图书所有信息
    public void Shuchu(){
        System.out.println("书名："+this.name);
        System.out.println("作者："+this.zuozhe);
        System.out.println("出版社："+this.chubanshe);
        System.out.println("价格："+this.jiage);
    }

}