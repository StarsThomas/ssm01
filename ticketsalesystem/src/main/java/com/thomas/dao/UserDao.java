package com.thomas.dao;

import com.thomas.domain.User;

import java.util.List;

public interface UserDao {
    List<User> selectAll();
}
