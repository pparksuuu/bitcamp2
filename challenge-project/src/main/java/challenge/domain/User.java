package challenge.domain;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int userNo;
    private String name;
    private char sex;
    private String id;
    private String password;
    private String userPath;
    private String userPhone;
    private int userType;
    
    
    @Override
    public String toString() {
        return "User [userNo=" + userNo + ", name=" + name + ", sex=" + sex + ", id=" + id + ", password="
                + password + ", userPath=" + userPath + ", userPhone=" + userPhone + ", userType=" + userType + "]";
    }
    public int getUserNo() {
        return userNo;
    }
    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public String getEmail() {
        return id;
    }
    public void setEmail(String id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUserPath() {
        return userPath;
    }
    public void setUserPath(String userPath) {
        this.userPath = userPath;
    }
    public String getUserPhone() {
        return userPhone;
    }
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    public int getUserType() {
        return userType;
    }
    public void setUserType(int userType) {
        this.userType = userType;
    }
    
}
