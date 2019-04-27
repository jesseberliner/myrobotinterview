package edu.berliner.myrobotinterview.Repositories;

import edu.berliner.myrobotinterview.Models.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long>
{
    Role findByRole(String role);
}
