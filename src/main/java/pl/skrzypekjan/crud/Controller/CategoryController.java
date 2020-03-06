package pl.skrzypekjan.crud.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.skrzypekjan.crud.Dao.CategoryDao;
import pl.skrzypekjan.crud.Dao.Entity.Category;

import javax.validation.Valid;

@Controller
@RequestMapping("/category")
public class CategoryController {

    private final CategoryDao categoryDao;

    public CategoryController(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }


    @GetMapping("/add")
    public String showRegistrationForm(Model model) {
        Category category = new Category();
        category.setDescription("Opis");
        model.addAttribute("category", category);
        return "category/add";
    }



    @PostMapping("/add")
    public String processForm(@Valid Category category, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "category/add";
        }
        categoryDao.save(category);
        model.addAttribute("category", category);
        return "category/success";
    }
}
