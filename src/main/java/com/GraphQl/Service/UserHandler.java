package com.GraphQl.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.GraphQl.DoaLayer.UserDao;
import com.GraphQl.Model.Users;

@Service
@Transactional
public class UserHandler {

	@Autowired
	private UserDao userDao;
	
	public List<Users> getAll() {
		return userDao.findAll();
	}

	public Users getUserByUd(int userId) {
		return userDao.getReferenceById(userId);	
	}

	public List<Users> saveOrUpdate(List<Users> users) {
		return userDao.saveAll(users);
	}
	
	public Users saveOrUpdateSingleEntity(Users users) {
		return userDao.save(users);
	}

	public Users deleteRecord(int userId) {
		Users user = getUserByUd(userId);
		userDao.delete(user);
		return user;
	}

	public Users getUserByUserName(String userName) {
		return userDao.loadDataByFirstNameOrLastName(userName);
	}
}
