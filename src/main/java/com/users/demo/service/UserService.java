
package com.users.demo.service;

import com.users.demo.model.User;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

public interface UserService {

    void addUser(User user);


    List<User> getListOfUsers();


    void editUser(Long id, User user);



    User getUserId(Long id);


    void deleteUserById(Long id);
}
