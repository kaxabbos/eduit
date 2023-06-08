package com.eduit.controller.main;

import com.eduit.model.Purchased;
import com.eduit.model.Statics;
import com.eduit.model.enums.Role;
import com.eduit.model.enums.Status;
import org.springframework.ui.Model;

import java.util.List;

public class Attributes extends Main {

    protected void AddAttributes(Model model) {
        model.addAttribute("role", getRole());
        model.addAttribute("user", getUser());
    }

    protected void AddAttributesUsers(Model model) {
        AddAttributes(model);
        model.addAttribute("users", usersRepo.findAll());
        model.addAttribute("roles", Role.values());
    }

    protected void AddAttributesIndex(Model model) {
        AddAttributes(model);
        model.addAttribute("teachers", teachersRepo.findAll());
    }

    protected void AddAttributesTeacherEdit(Model model, Long id) {
        AddAttributes(model);
        model.addAttribute("teacher", teachersRepo.getReferenceById(id));
    }

    protected void AddAttributesSubs(Model model) {
        AddAttributes(model);
        model.addAttribute("subs", subsRepo.findAll());
        model.addAttribute("teachers", teachersRepo.findAll());
    }

    protected void AddAttributesSubsMy(Model model) {
        AddAttributes(model);
        model.addAttribute("purchased", getUser().getPurchased());
    }

    protected void AddAttributesProgress(Model model) {
        AddAttributes(model);
        List<Purchased> purchasedList = purchasedRepo.findAllByStatus(Status.IN_PROGRESS);
        purchasedList.addAll(purchasedRepo.findAllByStatus(Status.DONE));
        model.addAttribute("purchased", purchasedList);
    }

    protected void AddAttributesSubEdit(Model model, Long id) {
        AddAttributes(model);
        model.addAttribute("sub", subsRepo.getReferenceById(id));
    }

    protected void AddAttributesStatics(Model model) {
        AddAttributes(model);
        List<Statics> staticsList = staticsRepo.findAll();
        model.addAttribute("statics", staticsList);
    }
}
