
package com.users.demo.dao;

import com.users.demo.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public class UserDaoImp implements UserDao {

   @PersistenceContext
   private EntityManager entityManager;
   @Override

   public void addUser(User user) {
      Long id=user.getId();
      if (id==null) {
         entityManager.persist(user);
      } else {
         editUser(id,user);
      }
   }
   @Override

   public List<User>getListOfUsers() {
      return entityManager.createQuery("select user from User user", User.class).getResultList();
   }
   @Override

   public void editUser(Long id, User user){
       entityManager.merge(user);

   }
   @Override

   public User getUserId(Long id){
      return entityManager.find(User.class, id);
   }

   @Override
   public void deleteUserById(Long id) {
      entityManager.createQuery("delete from User where id='"+id+"'").executeUpdate();
   }
}
