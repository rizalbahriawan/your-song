package com.mygroup.yoursong.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

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
public class UserServiceImpl {
    
    @Service("userService")
    @Transactional
    public class UserServiceImpl implements UserDetailsService{

        private static final AtomicLong counter = new AtomicLong();

        private static List<User> users;


        public List<User> findAllUsers() {
            return users;
        }

        public User findById(long id) {
            for(User user : users){
                if(user.getId() == id){
                    return user;
                }
            }
            return null;
        }

        public User findByEmail(String email) {
            for(User user : users){
                if(user.getEmail().equalsIgnoreCase(email)){
                    return user;
                }
            }
            return null;
        }

        public void saveUser(User user) {
            user.setId(counter.incrementAndGet());
            users.add(user);
        }

        public void updateUser(User user) {
            int index = users.indexOf(user);
            users.set(index, user);
        }

        public void deleteUserById(long id) {

            for (Iterator<User> iterator = users.iterator(); iterator.hasNext(); ) {
                User user = iterator.next();
                if (user.getId() == id) {
                    iterator.remove();
                }
            }
        }

        public boolean isUserExist(User user) {
            return findByEmail(user.getEmail())!=null;
        }

//            private static List<User> populateDummyUsers(){
//                    List<User> users = new ArrayList<User>();
//                    users.add(new User(counter.incrementAndGet(),"Sam",30, 70000));
//                    users.add(new User(counter.incrementAndGet(),"Tom",40, 50000));
//                    users.add(new User(counter.incrementAndGet(),"Jerome",45, 30000));
//                    users.add(new User(counter.incrementAndGet(),"Silvia",50, 40000));
//                    return users;
//            }

        public void deleteAllUsers() {
            users.clear();
        }

    }
    
}
