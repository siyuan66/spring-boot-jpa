package com.example.springbootjpa.dao;

import com.example.springbootjpa.entrity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {

    User findByUsername( String usernme);
}
