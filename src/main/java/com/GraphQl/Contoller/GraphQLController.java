package com.GraphQl.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import com.GraphQl.Model.Users;
import com.GraphQl.Service.UserHandler;

@Controller
public class GraphQLController {

	@Autowired
	private UserHandler userHandler;

	@SchemaMapping(value = "getUsersQL", typeName = "Query")
	private List<Users> getUsers() {
		System.out.println("Fatching All the users Data...");
		return userHandler.getAll();
	}
	
	@SchemaMapping(value = "getUserByIdQL", typeName = "Mutation")
	private Users getUserById(@Argument int userId) {
		System.out.println("Fatching the users Data by Id..." + userId);		
		return userHandler.getUserByUd(userId);
	}
	
	@SchemaMapping(value = "saveOrUpdate", typeName = "Mutation")
	private Users createUsers(@Argument int userId,@Argument String firstName, @Argument String lastName,@Argument int passwordId,@Argument String passwords,@Argument int schoolId,@Argument String schoolName,@Argument String schoolAddress, @Argument String schoolType) {
		System.out.println("Save or updating the user "  + firstName + lastName);
		return  userHandler.saveOrUpdateSingleEntity(Users.createUserObject(userId, firstName, lastName,passwordId, passwords, schoolId, schoolName, schoolAddress, schoolType));
	}
		
	@SchemaMapping(value = "getUserByIdQLTEST", typeName = "Query")
	private Users getUserByIdTEST(@Argument String userName) {
		System.out.println("-- TEST --- Fatching the users Data by Id..." + userName);
		return userHandler.getUserBySchoolName(userName);
	}	
}
