package com.example.web;

import com.example.config.Settings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/set")
public class SettingsController {

    @Autowired
    private Settings mySettings;

    @RequestMapping(method= RequestMethod.GET)
    public String settings (Model model) {
        model.addAttribute("settings", mySettings);
        return "settings";
    }
}
