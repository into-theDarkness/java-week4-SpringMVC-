package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class Calculator {
    @GetMapping("/haha")
    public String Display(){
        return "index";
    }
    @GetMapping("/calculate")
    public String Calculate(@RequestParam Float input1, @RequestParam Float input2, @RequestParam String operator, Model model){
        float result = 0;
        switch (operator){
            case "Addtion(+)":
                 result = input1 + input2;
                break;
            case "Subtraction(-)":
                result = input1 - input2;
                break;
            case "Multip(*)":
                result = input1*input2;
                break;
            case "Division(/)":
                result = input1/input2;
                break;
        }
        model.addAttribute("result", result);
        return "index";
    }
}
