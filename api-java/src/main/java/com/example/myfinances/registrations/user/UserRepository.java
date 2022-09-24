package com.example.myfinances.registrations.user;

import com.example.myfinances.generic.crud.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends GenericRepository<User, Long> {

    User findByUsername(String username);

}
