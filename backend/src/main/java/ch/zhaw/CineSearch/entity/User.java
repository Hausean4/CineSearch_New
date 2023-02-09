package ch.zhaw.CineSearch.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private String userName;
    private String password;
    private String eMail;

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    public String getUserName() {
        return userName;
    }
    public String geteMail() {
        return eMail;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
