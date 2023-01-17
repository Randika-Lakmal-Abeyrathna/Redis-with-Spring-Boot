package com.randikalakmal.service;

import com.randikalakmal.model.User;
import com.randikalakmal.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    @Override
    public boolean saveUser(User user) {

        return userDao.saveUser(user);
    }
}
