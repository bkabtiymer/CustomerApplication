package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;
@Controller
public class HomeController {
    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping("/")
    public String listCustomer (Model model){
        model.addAttribute("customers",customerRepository.findAll());
        return "index";
    }
//    @GetMapping("/add")
//    public String customerForm(Model model){
//        model.addAttribute("customer", new Customer());
//        return "customerform";
//    }
//    @PostMapping ("/process")
//    public String processForm(@Valid Customer customer,
//                              BindingResult result){
//
//    }
}
