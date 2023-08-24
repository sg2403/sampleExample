package org.sample.repository;


import java.util.List;
import java.util.Optional;

import org.sample.Entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, String>{
	@Query(value = "select login_id, password from login where login_id=?1",nativeQuery = true)
	Login findByLogin_id(String login_id);
	

}
