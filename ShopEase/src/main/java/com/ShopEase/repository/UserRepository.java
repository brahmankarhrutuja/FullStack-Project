package com.ShopEase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ShopEase.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    UserModel findByUsername(String username);
}
