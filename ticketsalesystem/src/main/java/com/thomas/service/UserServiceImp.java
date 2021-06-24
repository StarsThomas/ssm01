package com.thomas.service;

import com.thomas.dao.UserDao;
import com.thomas.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserDao userDao;

    public List<User> selectAll(){
        return userDao.selectAll();
    }
}
