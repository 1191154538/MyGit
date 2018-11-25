package org.java.web;

import org.java.service.InfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InfController {
    @Autowired
    private InfService infService;

    @RequestMapping("/load")
    public  String LOAD(Model model){
        model.addAttribute("list",infService.findInf());

        return  "/show";
    }




}
