package girlyblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //Dit markeert de class als een application class
public class GirlyBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(GirlyBlogApplication.class, args); //hoe werkt dit precies? Waarom is het zo opgezet?
        //wel duidelijk dat dit deel is van de initializatie.
    }
}
