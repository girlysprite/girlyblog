/**
 * This class is the basic for the blogpost entities.
 * <p>It has the info about the title, date and contents. </p>
 * <p>I can set and get those variables in here.  </p>
 * @author Hanneke Debie
 * @version 0.1
 *
 **/
package girlyblog.domain;

import java.time.LocalDateTime;

public class Post {

    private String title;  //de titel van een post
    private String body;  //de content van de post
    private LocalDateTime publishDate;  //wanneer het gepost is

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDateTime publishDate) {
        this.publishDate = publishDate;
    }
}
