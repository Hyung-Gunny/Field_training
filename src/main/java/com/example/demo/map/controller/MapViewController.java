package com.example.demo.map.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MapViewController
{
    @GetMapping("/map")
    public ModelAndView showMapPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("map");
        return modelAndView;
    }
}
