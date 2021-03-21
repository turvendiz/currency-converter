package ru.turvendiz.currencyconverter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/main-page")
public class MainController {

    @GetMapping
    public ModelAndView getMainPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("main-page");
        return mv;
    }
}
