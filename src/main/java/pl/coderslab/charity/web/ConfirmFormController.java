package pl.coderslab.charity.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/confirm")
public class ConfirmFormController {

    @GetMapping
    public String confirm(){
        return "form-confirmation";
    }

}
