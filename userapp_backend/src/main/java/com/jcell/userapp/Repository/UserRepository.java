package com.jcell.userapp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jcell.userapp.Entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
