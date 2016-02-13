package com.example.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private static final Logger logger =
            LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/")
    public String home(Device device, Model model) {
        model.addAttribute("name", getDevice(device));
        return "home";
    }

    private String getDevice(Device device) {
        String platform;
        if (device.isMobile()) {
            platform = "mobile";
            logger.info("Hello mobile user!");
        } else if (device.isTablet()) {
            platform = "tablet";
            logger.info("Hello tablet user!");
        } else {
            platform = "desktop";
            logger.info("Hello desktop user!");
        }
        return platform;
    }
}
