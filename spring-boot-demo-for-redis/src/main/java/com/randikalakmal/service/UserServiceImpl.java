package com.randikalakmal.service;

import com.randikalakmal.model.User;
import com.randikalakmal.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    @Override
    public boolean saveUser(User user) {

        return userDao.saveUser(user);
    }

    @Override
    public List<User> fetchAllUser() {
        return userDao.fetchAllUser();
    }
}
