package com.mygroup.yoursong.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.mygroup.yoursong.model.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rizal
 */
public interface UserService {
    User findById(long id);
	
    User findByEmail(String email);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> findAllUsers(); 

    void deleteAllUsers();

    public boolean isUserExist(User user);
}
