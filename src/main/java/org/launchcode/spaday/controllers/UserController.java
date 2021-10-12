package org.launchcode.spaday.controllers;


import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("add")
   public String displayAddUserForm(Model model){
//        model.addAttribute(new User());
        return "user/add";
    }


    @PostMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        model.addAttribute("user", user);

        if(user.getPassword() == verify){
            return "user/index";
        }
       else { return "user/add";}

    }


}
