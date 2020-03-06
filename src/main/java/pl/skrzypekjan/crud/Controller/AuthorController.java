package pl.skrzypekjan.crud.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.skrzypekjan.crud.Dao.AuthorDao;
import pl.skrzypekjan.crud.Dao.Entity.Author;

import javax.validation.Valid;

@Controller
@RequestMapping("/author")
public class AuthorController {

    private final AuthorDao authorDao;

    public AuthorController(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @GetMapping("/add")
    public String showRegistrationForm(Model model) {
        Author author = new Author();
        author.setFirstName("Arek");
        model.addAttribute("author", author);
        return "author/add";
    }



    @PostMapping("/add")
    public String processForm(@Valid Author author, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "author/add";
        }
        authorDao.save(author);
        model.addAttribute("author", author);
        return "author/success";
    }
}
