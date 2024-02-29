package com.springcourse.preproject31.Service;


import com.springcourse.preproject31.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Integer userId);


    public void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Integer userId);

}
