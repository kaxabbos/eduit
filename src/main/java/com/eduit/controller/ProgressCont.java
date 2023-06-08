package com.eduit.controller;

import com.eduit.controller.main.Attributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/progress")
public class ProgressCont extends Attributes {

    @GetMapping
    public String progress(Model model) {
        AddAttributesProgress(model);
        return "progress";
    }
}
