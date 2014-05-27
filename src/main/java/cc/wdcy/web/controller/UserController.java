package cc.wdcy.web.controller;

import cc.wdcy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Shengzhao Li
 */
@Controller
@RequestMapping("/user/")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("overview.htm")
    public String overview(Model model) {

        return "user_overview";
    }


}