package pl.skrzypekjan.crud.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.skrzypekjan.crud.Dao.ArticleDao;
import pl.skrzypekjan.crud.Dao.AuthorDao;
import pl.skrzypekjan.crud.Dao.CategoryDao;
import pl.skrzypekjan.crud.Dao.Entity.Article;

import javax.validation.Valid;
import java.time.LocalDate;

@Controller
@RequestMapping("/article")
public class ArticleController {

    private final ArticleDao articleDao;
    private final AuthorDao authorDao;
    private final CategoryDao categoryDao;


    public ArticleController(ArticleDao articleDao, AuthorDao authorDao, CategoryDao categoryDao) {
        this.articleDao = articleDao;
        this.authorDao = authorDao;
        this.categoryDao = categoryDao;
    }


    @GetMapping("/add")
    public String showRegistrationForm(Model model) {
        Article article = new Article();
        model.addAttribute("author", authorDao.findAll());
        model.addAttribute("category", categoryDao.findAll());
        article.setCreated(LocalDate.now().toString());
        article.setUpdated(LocalDate.now().toString());
        article.setTitle("Tytul ");
        model.addAttribute("article", article);
        return "article/add";
    }



    @PostMapping("/add")
    public String processForm(@Valid Article article, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("author", authorDao.findAll());
            model.addAttribute("category", categoryDao.findAll());
            return "article/add";
        }
        articleDao.save(article);
        model.addAttribute("article", articleDao.findById(article.getId()));
        //model.addAttribute("article", article);
        return "article/success";
    }
}
