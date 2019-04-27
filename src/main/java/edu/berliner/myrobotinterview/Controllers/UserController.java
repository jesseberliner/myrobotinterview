package edu.berliner.myrobotinterview.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController
{


    @RequestMapping("/uploadresume")
    public String uploadResume(Model model)
    {
        return "upload";
    }
}
