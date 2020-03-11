package pl.skrzypekjan.crud.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.skrzypekjan.crud.Dao.CategoryDao;
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
        model.addAttribute("category", categoryDao.findAll());
        return "category/show";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showAddForm(Model model) {
        Category category = new Category();
        model.addAttribute("category", categoryDao.findAll());
        category.setDescription("Description");
        model.addAttribute("category", category);
        return "category/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String processAddForm(@Valid Category category, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("category", categoryDao.findAll());
            return "category/add";
        }
        categoryDao.save(category);
        //List<Category> list = categoryDao.findAll();
        //System.out.println(list);
        //model.addAttribute("category", list);
        //trying to understand the error that was
        //hidden in the view, however the list also works
        model.addAttribute("category", categoryDao.findAll());
        return "category/show";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editCategory(@PathVariable long id, Model model) {
        Category one = categoryDao.findById(id);
        model.addAttribute("category", one);
        return "category/edit";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String editCategorySuccess(@ModelAttribute("category") Category category) {
        categoryDao.update(category);
        return "redirect:/category/show";
    }

    @RequestMapping(value = "/remove/{id}", method = RequestMethod.GET)
    public String removeCategory(@PathVariable long id, Model model) {
        Category one = categoryDao.findById(id);
        System.out.println(one);
        categoryDao.delete(one);
        return "redirect:/category/show";
    }
}
