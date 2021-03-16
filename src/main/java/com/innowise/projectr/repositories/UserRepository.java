package com.innowise.projectr.repositories;

import org.springframework.data.repository.CrudRepository;
import com.innowise.projectr.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User getUserByLogin(String login);

}
