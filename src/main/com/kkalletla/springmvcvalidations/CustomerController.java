package main.com.kkalletla.springmvcvalidations;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("customer")
public class CustomerController {

    /*Adding InitBinder to trim white spaces*/
    @InitBinder
    public void initBinder(WebDataBinder binder){
        StringTrimmerEditor trimEditor = new StringTrimmerEditor(true);

        binder.registerCustomEditor(String.class,trimEditor);

    }

    @RequestMapping("showForm")
    public String showForm(Model model){
        model.addAttribute("customer", new Customer());
        return "customerForm";
    }

    @RequestMapping("processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult result){

        System.out.println("Binding Result: "+result);
        if(result.hasErrors())
            return "customerForm";
        else
            return "customerConfirmation";
    }
}
