package com.lisa.service;
import java.util.List;
import com.lisa.model.User;

public interface UserService{
	User login(User user);
	List<User> selectAllUser();
	void addUser(User user);
	void updateUser(User user);
	void deleteUser(Integer id);
}