package edu.berliner.myrobotinterview.Controllers;

import edu.berliner.myrobotinterview.Models.Job;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.Date;

@Controller
public class UserController
{


    @RequestMapping("/uploadresume")
    public String uploadResume(Model model)
    {
        return "upload";
    }


}
