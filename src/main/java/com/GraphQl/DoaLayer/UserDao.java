package com.GraphQl.DoaLayer;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GraphQl.Model.Users;
@Repository
public interface UserDao extends JpaRepository<Users, Integer> {


	@Query("SELECT u FROM Users u WHERE u.firstName = :userName or u.lastName = :userName")
	Users loadDataByFirstNameOrLastName(String userName);

}
