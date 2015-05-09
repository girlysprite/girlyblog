package girlyblog.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller  //Dit markeert de java class als een controller class.

public class TextboxController {

    Logger logger = LoggerFactory.getLogger(getClass());

    /*
    RequestMapping geeft aan welke requests je verwacht te kringen.
    elke request method kun je dus definieren met de variabelen die je verwacht te krijgen in de request (zoals name=hanne),
    en als laatste voeg je ook nog de model variabele toe.
    Model is simpel in Spring MVC. Elke request method krijgt een model mee, en die model vul je verder in je request method.
    Vervolgens wordt deze doorgegeven aan de template, die alles dan weer kan uitlezen.
     */

    @RequestMapping(value = "/textbox", method = RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting()); //de attribute heet "content" en daar wordt de object (string) content in gestopt.
        logger.info("textbox shown");
        return "greeting";
    }

    @RequestMapping(value="/textbox", method = RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", Greeting);
        logger.info("input given");
        return "result";

}
}
