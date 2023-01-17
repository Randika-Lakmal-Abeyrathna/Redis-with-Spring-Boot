package com.randikalakmal.repository;

import com.randikalakmal.model.User;

public interface UserDao {
    boolean saveUser(User user);
}
