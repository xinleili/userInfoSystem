package com.lisa.mapper;
import java.util.List;
import com.lisa.model.User;
public interface UserMapper {
     public User selectLogin(User user);
     public List<User> selectAllUser();
     public void addUser(User user);
     public void updateUser(User user);
     public void deleteUser(Integer id);
}
