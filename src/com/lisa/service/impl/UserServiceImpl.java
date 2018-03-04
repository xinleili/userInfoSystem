package com.lisa.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lisa.service.UserService;
import com.lisa.model.User;
import com.lisa.mapper.UserMapper;

@Service
@Transactional
public class UserServiceImpl implements UserService{
  @Autowired
  public UserMapper userMapper;
  
  @Override
  public User login(User user){
	   return userMapper.selectLogin(user);
  }
  
  @Override
  public List<User> selectAllUser(){
	  List<User> users = userMapper.selectAllUser();
	  return users;
  }
  
  @Override
  public void addUser(User user){
	  userMapper.addUser(user);
  }
  
  @Override
  public void updateUser(User user){
	  userMapper.addUser(user);
  }
  
  @Override
  public void deleteUser(Integer id){
	  userMapper.deleteUser(id);
  }

}
