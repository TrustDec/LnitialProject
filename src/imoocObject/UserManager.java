package imoocObject;

public class UserManager{
    // 用户信息验证的方法
    public String checkUser(User one, User two) {
        String msg = "";
        String name1 = one.getName();
        String name2 = two.getName();
        String pwd1 = one.getPwd();
        String pwd2 = two.getPwd();
        // 判断用户名是否为空，是否一致
        if (name1 != null && name2 != null){
            if (!name1.equals(name2)){
                msg = "用户名不一致";
            }
        }else{
            msg = "用户名不允许为空";
        }
        // 判断密码是否为空，是否一致
        if (pwd1 != null && pwd2 != null){
            if (!pwd1.equals(pwd2)){
                msg = "密码不一致";
            }
        }else{
            msg = "密码不允许为空";
        }
        return msg;

    }
}