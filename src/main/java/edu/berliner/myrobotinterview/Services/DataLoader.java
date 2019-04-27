package edu.berliner.myrobotinterview.Services;

import edu.berliner.myrobotinterview.Models.Role;
import edu.berliner.myrobotinterview.Models.User;
import edu.berliner.myrobotinterview.Repositories.RoleRepository;
import edu.berliner.myrobotinterview.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner
{
    @Autowired
    RoleRepository roleRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... strings) throws Exception
    {


        if (roleRepository.count() == 0)
        {

            roleRepository.save(new Role("USER"));
            roleRepository.save(new Role("ADMIN"));

            Role userRole = roleRepository.findByRole("USER");
            Role adminRole = roleRepository.findByRole("ADMIN");

            User user = new User("jim@jim.com", "password", "Jim",
                                 "Jimmerson", true, "jim",
                                 "123-456-7890");
            user.setRoles(Arrays.asList(userRole));
            userRepository.save(user);

            user = new User("sam@sammy.com", "password", "Sam",
                            "Sammy", true, "sam",
                            "703-456-7890");
            user.setRoles(Arrays.asList(userRole));
            userRepository.save(user);

            user = new User("admin@admin.com", "password", "Admin",
                            "Admin", true, "admin", "999-999-9999");
            user.setRoles(Arrays.asList(adminRole));
            userRepository.save(user);


        }
    }
}
