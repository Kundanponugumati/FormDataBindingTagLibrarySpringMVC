package com.telusko.controller;

import com.telusko.model.Implementers;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class ImplementerController {

    private Implementers obj;

    @GetMapping("/register")
    public String responseHome()
    {
        return "register";
    }

//    @PostMapping("/register")
//    public String registerData(Map<String,Object> model, HttpServletRequest request)
//    {
//       Integer id = Integer.valueOf(request.getParameter("id"));
//       String name = request.getParameter("name");
//       String city = request.getParameter("city");
//       Double salary = Double.valueOf(request.getParameter("salary"));
//       obj.setId(id);
//       obj.setName(name);
//       obj.setCity(city);
//       obj.setSalary(salary);
//       model.put("data",obj);
//        return "result";
//    }

    @PostMapping("/register")
    public String registerData(Map<String,Object> model, @ModelAttribute("impl") Implementers impl)
    {
        System.out.println(impl);
        model.put("data",impl);
        return "result";
    }


}
