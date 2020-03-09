package pl.skrzypekjan.crud.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.skrzypekjan.crud.Dao.CategoryDao;
import pl.skrzypekjan.crud.Dao.Entity.Article;
import pl.skrzypekjan.crud.Dao.Entity.Category;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

    private final CategoryDao categoryDao;

    public CategoryController(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String showList(@Valid Category category, BindingResult result, Model model){
        model.addAttribute("cat", categoryDao.findAll());
        return "category/show";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        Category category = new Category();
        category.setDescription("Desription");
        model.addAttribute("category", category);
        return "category/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String processForm(@Valid Category category, BindingResult result, Model model) {
        if (result.hasErrors()) {
            System.out.println("nie dzia?a debilu");
            return "category/add";
        }
        categoryDao.save(category);
        List<Category> list = categoryDao.findAll();
        System.out.println(list);
        model.addAttribute("category", list);
        return "category/show";
    }


}
