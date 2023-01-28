package spring_b_s_rest.controller;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AdminController {
    @GetMapping("/")
    public String getAdminPage() {
        return "adminpage";
    }

}
