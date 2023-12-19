package com.GraphQl.DoaLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GraphQl.Model.Password;

@Repository
public interface PasswordDao extends JpaRepository<Password, Integer>{

}
