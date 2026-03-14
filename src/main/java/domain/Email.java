package domain;

import exeption.EmailExeption;

public class Email {
    private String email;

    public Email(String email) {
        if(!email.contains("@company.com")){
            throw new EmailExeption("Invalid email address");
        }
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}