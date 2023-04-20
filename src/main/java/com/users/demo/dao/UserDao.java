
package com.users.demo.dao;

import com.users.demo.model.User;



import java.beans.Transient;
import java.util.List;

public interface UserDao {
   @Transient
   void addUser(User user);
   List<User> getListOfUsers();



    void editUser(Long id, User user);



    User getUserId(Long id);

    void deleteUserById(Long id);

}