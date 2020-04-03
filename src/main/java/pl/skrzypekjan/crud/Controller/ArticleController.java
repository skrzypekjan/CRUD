package pl.skrzypekjan.crud.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.skrzypekjan.crud.Dao.ArticleDao;
import pl.skrzypekjan.crud.Dao.AuthorDao;
import pl.skrzypekjan.crud.Dao.CategoryDao;
import pl.skrzypekjan.crud.Dao.Entity.Article;
import pl.skrzypekjan.crud.Dao.Entity.Author;
import pl.skrzypekjan.crud.Dao.Entity.Category;

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

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String showList(@Valid Article article, BindingResult result, Model model){
        model.addAttribute("article", articleDao.findAll());
        return "article/show";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        Article article = new Article();
        model.addAttribute("author", authorDao.findAll());
        model.addAttribute("category", categoryDao.findAll());
        article.setCreated(LocalDate.now().toString());
        article.setUpdated(LocalDate.now().toString());
        article.setTitle("Title ");
        model.addAttribute("article", article);
        return "article/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String processForm(@Valid Article article, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("author", authorDao.findAll());
            model.addAttribute("category", categoryDao.findAll());
            return "article/add";
        }
        articleDao.save(article);
        model.addAttribute("article", articleDao.findById(article.getId()));
        model.addAttribute("article", article);
        return "article/show";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editArticle(@PathVariable int id, Model model) {
        Article one = articleDao.findById(id);
//        model.addAttribute("author", authorDao.findAll());
//        model.addAttribute("category", categoryDao.findAll());
//        one.setAuthor(one.getAuthor());
//        one.setCreated(one.getCreated());
//        one.setUpdated(LocalDate.now().toString());
        model.addAttribute("article", one);
        return "article/edit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editArticleSuccess(@ModelAttribute("article") Article article) {
        articleDao.update(article);
        return "redirect:/article/show";
    }

    @RequestMapping(value = "/remove/{id}", method = RequestMethod.GET)
    public String removeArticle(@PathVariable int id, Model model) {
        Article one = articleDao.findById(id);
        articleDao.delete(one);
        return "redirect:/article/show";
    }
}
