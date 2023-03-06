package shop.mtcoding.miniproject.model;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonScrap {
    private int id;
    private int pInfoId;
    private int postId;
    private Timestamp created_at;
}
