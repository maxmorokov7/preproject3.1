package com.springcourse.preproject31.DAO;


import com.springcourse.preproject31.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getUserById(Integer userId);

    public void saveUser(User user);


    void updateUser(User user);

    void deleteUser(Integer userId);
}
