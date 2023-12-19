package com.GraphQl.DoaLayer;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.GraphQl.Model.Users;
@Repository
public interface UserDao extends JpaRepository<Users, Integer> {

	@Query("SELECT u FROM Users u WHERE u.schoolInfo.schoolName = :name")
	Users getUserBySchoolName(@Param("name") String name);

}
