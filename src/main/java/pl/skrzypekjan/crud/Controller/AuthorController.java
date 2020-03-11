package pl.skrzypekjan.crud.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.skrzypekjan.crud.Dao.AuthorDao;
import pl.skrzypekjan.crud.Dao.Entity.Author;
import pl.skrzypekjan.crud.Dao.Entity.Category;

import javax.validation.Valid;

@Controller
@RequestMapping("/author")
public class AuthorController {

    private final AuthorDao authorDao;

    public AuthorController(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String showList(@Valid Category author, BindingResult result, Model model){
        model.addAttribute("author", authorDao.findAll());
        return "author/show";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        Author author = new Author();
        model.addAttribute("author", authorDao.findAll());
        author.setFirstName("Arek");
        model.addAttribute("author", author);
        return "author/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String processForm(@Valid Author author, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "author/add";
        }
        authorDao.save(author);
        model.addAttribute("author", authorDao.findAll());
        return "author/show";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editAuthor(@PathVariable int id, Model model) {
        Author one = authorDao.findById(id);
        System.out.println(one);
        System.out.println("dziala");
        model.addAttribute("author", one);
        return "author/edit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editAuthorSuccess(@ModelAttribute("author") Author author) {
        authorDao.update(author);
        return "redirect:/author/show";
    }

    @RequestMapping(value = "/remove/{id}", method = RequestMethod.GET)
    public String removeAuthor(@PathVariable int id, Model model) {
        Author one = authorDao.findById(id);
        System.out.println(one);
        authorDao.delete(one);
        return "redirect:/author/show";
    }


}
