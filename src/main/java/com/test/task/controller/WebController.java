package com.test.task.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller handling index web page.
 * @author Dmitry Karmanov
 * @version 1.0
 */
@Controller
public class WebController {
    /**
     * Index page GET mapper.
     * @return ModelAndView Index page without any data.
     */
    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
