package com.users.demo.service;

import com.users.demo.dao.UserDao;
import com.users.demo.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class UserServiceImp implements UserService {

   private final UserDao userDao;

   public UserServiceImp(UserDao userDao) {
      this.userDao = userDao;
   }

   @Override
   @Transactional
   public void addUser(User user) {
      userDao.addUser(user);
   }

   @Override
   @Transactional(readOnly = true)
   public List<User> getListOfUsers() {
      return userDao.getListOfUsers();
   }

   @Override
   @Transactional
   public void editUser(Long id, User user) {
      userDao.editUser(id, user);
   }

   @Override
   @Transactional
   public User getUserId(Long id) {
      return userDao.getUserId(id);
   }

   @Override
   @Transactional
   public void deleteUserById(Long id) {
      userDao.deleteUserById(id);
   }




}
