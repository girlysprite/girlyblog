/**
 * This is a controller class.
 * <p>The Controller annotation marks it as such. This class gets the webrequests through the RequestMapping annotation.
 * Based on which part of the webspage is called (the stuff behind the slash) it directs the rest of the code to do different things.</p>
 * <p>A logger is also included.</p>
 * @author Hanneke Debie
 * @version 0.1
 */

package girlyblog.web; //Dit geeft tot welke package deze file behoort.

import girlyblog.domain.Post; //post included (mn eigen code) om er gebruik van te kunnen maken.
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalDateTime;


@Controller
public class PostController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/post")
    public String post(Model model) {  // een model is een manier om informatie naar de template te krijgen.
        Post post = new Post(); //Hier maak ik een post object, die alle variabelen in zich heeft die ik nodig heb.
        //zo kan ik een hele lading variabelen naar het template toe krijgen.
        //Hier kan ik straks eerst data uit een DB halen en dan toewijzen ipv hier zelf strings verzinnen.
        post.setTitle("This is a post.");
        post.setBody("This is a short post.");
        post.setPublishDate(LocalDateTime.now());
        model.addAttribute("post", post);
        logger.info("/post called!");
        return "post";
    }

}