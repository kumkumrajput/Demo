package com.commodity.domain.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;

import com.commodity.domain.model.User;

public interface LoginRepository extends PagingAndSortingRepository<User, String> {
	
	@Query(value="SELECT u FROM com.commodity.domain.model.User u WHERE u.email =:email")
	public User findUserByEmail(@Param("email") String email) throws Exception;

}
