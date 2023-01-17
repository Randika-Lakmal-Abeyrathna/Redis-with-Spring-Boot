package com.randikalakmal.service;

import com.randikalakmal.model.User;

import java.util.List;

public interface UserService {
    boolean saveUser(User user);

    List<User> fetchAllUser();

    User fetchUserbyId(Long id);

    boolean deleteUser(Long id);

    boolean updateUserById(User user, Long id);
}
