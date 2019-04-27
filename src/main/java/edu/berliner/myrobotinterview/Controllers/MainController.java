package edu.berliner.myrobotinterview.Controllers;

import edu.berliner.myrobotinterview.Models.Role;
import edu.berliner.myrobotinterview.Models.User;
import edu.berliner.myrobotinterview.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class MainController {

    @Autowired
    private UserService userService;


    @RequestMapping({"/index","/"})
    public String index()
    {
        System.out.println("index");
        if(userService.getUser()!=null) {
            User user1 = userService.getUser();
            System.out.println(user1.getRoles().size());
            if (user1.getRoles().contains("ADMIN")) {
                System.out.println("admin");
            }
            if (user1.getRoles().contains("USER")) {
                System.out.println("user");
            }
            System.out.println(user1.getRoles());
            System.out.println(user1.getRoles().toArray().toString());
            System.out.println(user1.getRoles().toString());
        }
        return "index";

    }
}
