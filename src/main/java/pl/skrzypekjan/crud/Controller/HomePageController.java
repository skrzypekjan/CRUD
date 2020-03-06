package pl.skrzypekjan.crud.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.skrzypekjan.crud.Dao.ArticleDao;
import pl.skrzypekjan.crud.Dao.ArticleRepository;
import pl.skrzypekjan.crud.Dao.Entity.Article;

import java.util.List;

@Controller
@RequestMapping("")
public class HomePageController {
    private final ArticleDao articleDao;
    private final ArticleRepository articleRepository;

    public HomePageController(ArticleDao articleDao, ArticleRepository articleRepository) {
        this.articleDao = articleDao;
        this.articleRepository = articleRepository;
    }

    @GetMapping("/")
    public String showRegistrationForm(Model model) {
        return "home";
    }

    @GetMapping("/home/add")
    public String showLastFive(Model model) {

        List<Article> list = articleRepository.findLastFive();
        System.out.println("##***************************************");
        System.out.println(list);
        model.addAttribute("articles", list);
        return "home/add";
    }

    @PostMapping("/home/add")
    public String processForm(BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<Article> list = articleRepository.findLastFive();
            model.addAttribute("list", list);
            return "home/add";
        }
//          articleDao.save(article);
//          model.addAttribute("article", articleDao.findById(article.getId()));
        //model.addAttribute("article", article);
        return "home/success";
    }
}
