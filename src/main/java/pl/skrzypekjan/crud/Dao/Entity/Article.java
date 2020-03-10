package pl.skrzypekjan.crud.Dao.Entity;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "articles")
//@ToString(exclude = {"author"})
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Size(max = 200)
    private String title;
    @ManyToOne
    private Author author;
    @ManyToOne
    private Category category;
    @Size(max = 600)
    private String content;
    private String created;
    private String updated;
}
