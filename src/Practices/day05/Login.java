package Practices.day05;

import day02.SringPractice3;

public class Login {

    private String username;
    private String password;

    public void setUsername (String username) {
        this.username = username;
    }

    public void setPassword (String password) {
        if (password.length() >= 8) {
            this.password = password;
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword () {
        return password;
    }

}
