package imoocObject;

public class BookTest {

    // 测试方法
    public static void main(String[] args) {
        //实例化对象，调用相关方法实现运行效果
        Book book = new Book("红楼梦","曹雪芹","人民文学出版社",10);
        book.Shuchu();
        System.out.println("===================");
        Book bookOne = new Book("小李飞刀","古龙","中国长安出版社",55.5);
        bookOne.Shuchu();
    }
}
