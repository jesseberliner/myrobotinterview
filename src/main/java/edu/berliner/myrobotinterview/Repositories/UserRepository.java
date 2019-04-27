package edu.berliner.myrobotinterview.Repositories;

import edu.berliner.myrobotinterview.Models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface UserRepository extends CrudRepository<User, Long>
{
    User findByUsername(String username);
    User findByEmail(String email);
    Long countByEmail(String email);
    Long countByUsername(String username);
}
