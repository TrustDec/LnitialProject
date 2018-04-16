package imoocObject;

public class Test{
    // 测试方法
    public static void main(String[] args) {
        //实例化对象，调用相关方法实现运行效果
        User user = new User();
        user.setName("Lucy");
        user.setPwd("123456");
        System.out.println(user.getName());
        System.out.println(user.getPwd());
        User user1 = new User();
        user1.setName("Mike");
        user1.setPwd("123456");
        System.out.println(user1.getName());
        System.out.println(user1.getPwd());
        UserManager usermanager = new UserManager();
        String message = usermanager.checkUser(user,user1);

        System.out.println(message);
    }
}
