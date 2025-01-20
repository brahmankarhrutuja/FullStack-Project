package com.ShopEase.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserModel {

    @Id
    private Long id;
    private String username;
    private String password;

    // Getters and setters
}
