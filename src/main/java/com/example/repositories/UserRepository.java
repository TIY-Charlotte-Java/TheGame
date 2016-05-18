package com.example.repositories;

import com.example.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ultramar on 5/17/16.
 */
public interface UserRepository extends CrudRepository<User, Integer> {

}
