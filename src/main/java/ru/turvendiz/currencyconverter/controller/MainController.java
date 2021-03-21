package ru.turvendiz.currencyconverter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import ru.turvendiz.currencyconverter.model.Quote;

@Controller
@RequestMapping(value = "/main-page")
public class MainController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public ModelAndView getMainPage() {
        ModelAndView mv = new ModelAndView();
        Quote quote = restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", Quote.class);
        if (quote != null) {
            mv.addObject("quote", quote.getValue().getQuote());
        }
        mv.setViewName("main-page");
        return mv;
    }
}
