package org.example.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Reader {

    private String login;

    //Password as string bad idea
    private String password;
    private String firstName;
    private String lastName;
    private int age;

    @Override
    public String toString() {
        return "Reader{" +
                "login='" + login + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
