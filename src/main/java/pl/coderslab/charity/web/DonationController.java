package pl.coderslab.charity.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.domain.model.Category;
import pl.coderslab.charity.service.CategoryService;
import pl.coderslab.charity.service.DonationService;

import java.util.List;

@Controller
public class DonationController {

    private CategoryService categoryService;

    public DonationController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping("/addGift")
    public String prepareAddGift(){
        return "form";
    }

    @ModelAttribute(name = "categories")
    public List<Category> categoryList(){
        return categoryService.distinctCategoryList();
    }

}
