package com.GraphQl.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.GraphQl.Model.Users;
import com.GraphQl.Service.UserHandler;

@RestController
public class UserContoller {

	@Autowired
	private UserHandler userHandler;

	@RequestMapping(method = RequestMethod.GET, value = "/getAllUsers", consumes = "Application/Json", produces = "Application/Json")
	private List<Users> getUsers() {
		System.out.println("Fatching All the users Data...");
		return userHandler.getAll();
	}
	

	@RequestMapping(method = RequestMethod.GET, value = "getUserById/{userId}", consumes = "Application/Json", produces = "Application/Json")
	private Users getUserById(@PathVariable int userId) {
		System.out.println("Fatching the users Data by Id..." + userId);
		return userHandler.getUserByUd(userId);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/Save", consumes = "Application/Json", produces = "Application/Json")
	private List<Users> saveOrUpdateUserData(@RequestBody List<Users> users) {
		System.out.println("Saving or updating the users Data ..." );
		return userHandler.saveOrUpdate(users);	
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{userId}", consumes = "Application/Json", produces = "Application/Json")
	private Users deleteUsers(@PathVariable int userId) {
		System.out.println("Deleting the users Data ..." );
		return userHandler.deleteRecord(userId);
	}
	
	
}
