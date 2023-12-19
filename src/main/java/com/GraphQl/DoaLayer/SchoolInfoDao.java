package com.GraphQl.DoaLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GraphQl.Model.SchoolInfo;

@Repository
public interface SchoolInfoDao extends JpaRepository<SchoolInfo, Integer>{

}
