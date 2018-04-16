package imoocObject;
public class User{
    //定义属性用户名、密码
    private String name = "";
    private String pwd = "";

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }
}