package girlyblog.web;

import girlyblog.domain.Post;
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
        Post post = new Post();
        post.setTitle("This is a post.");
        post.setBody("This is a short post.");
        post.setPublishDate(LocalDateTime.now());
        model.addAttribute("post", post);
        logger.info("/post called!");
        return "post";
    }

}