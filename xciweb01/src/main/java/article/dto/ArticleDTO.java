package article.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@ToString
public class ArticleDTO implements Serializable {
    private long no;
    private String title;
    private String name;
    private String password;
    private String content;
    private Date regdate;
    private int readcount;

    public void setPassword(String password) {
        this.password = DigestUtils.sha512Hex(password);
    }
}