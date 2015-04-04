/**
 * This is a controller class.
 * <p>The Controller annotation marks it as such. This class gets the webrequests through the RequestMapping annotation.
 * Based on which part of the webspage is called (the stuff behind the slash) it directs the rest of the code to do different things.</p>
 * <p>A logger is also included.</p>
 * @author Hanneke Debie
 * @version 0.1
 */
package girlyblog.web; //Dit geeft tot welke package deze file behoort.

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller  //Dit markeert de java class als een controller class.
public class GreetingsController {

    Logger logger = LoggerFactory.getLogger(getClass());

    /*
    RequestMapping geeft aan welke requests je verwacht te kringen.
    elke request method kun je dus definieren met de variabelen die je verwacht te krijgen in de request (zoals name=hanne),
    en als laatste voeg je ook nog de model variabele toe.
    Model is simpel in Spring MVC. Elke request method krijgt een model mee, en die model vul je verder in je request method.
    Vervolgens wordt deze doorgegeven aan de template.
     */

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name); //de attribute heet "name" en daar wordt de object (string) name in gestopt.
        logger.info("/greeting called!");
        return "greeting";
    }

}