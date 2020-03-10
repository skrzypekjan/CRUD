package pl.skrzypekjan.crud.Dao.Entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Size(max = 100)
    private String name;
    private String description;
}
