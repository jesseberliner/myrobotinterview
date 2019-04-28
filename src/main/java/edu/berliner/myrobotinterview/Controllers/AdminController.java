package edu.berliner.myrobotinterview.Controllers;

import edu.berliner.myrobotinterview.Models.Job;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController
{
    @GetMapping("/addjob")
    public String addJob(Model model)
    {
        model.addAttribute("job", new Job());
        return "addjob";
    }

    @PostMapping("/addjob")
    public String addJobPost(@ModelAttribute("job") Job job,
                             @RequestParam("dateExpires") String dateExpires,
                             @RequestParam("keywords") String keywords)
    {
        System.out.println(dateExpires);
        System.out.println(keywords);
        return "index"; //change to jobs or jobadded
    }
}
