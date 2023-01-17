package com.randikalakmal.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private Long id;
    private String firstName;
    private String LastName;
    private String emailId;
    private int age;
}
