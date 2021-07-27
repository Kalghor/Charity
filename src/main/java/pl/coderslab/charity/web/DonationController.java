package pl.coderslab.charity.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.charity.domain.model.Category;
import pl.coderslab.charity.domain.model.Donation;
import pl.coderslab.charity.domain.model.Institution;
import pl.coderslab.charity.service.CategoryService;
import pl.coderslab.charity.service.InstitutionService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class DonationController {

    private CategoryService categoryService;
    private InstitutionService institutionService;

    public DonationController(CategoryService categoryService, InstitutionService institutionService) {
        this.categoryService = categoryService;
        this.institutionService = institutionService;
    }

    @GetMapping("/addGift")
    public String prepareAddGift(Model model){
        model.addAttribute("donation", new Donation());
        return "form";
    }

    @PostMapping("/addGift")
    public String processAddGift(@Valid Donation donation, BindingResult bindingResult, Model model, @RequestParam Institution institution, @RequestParam String[] categories){
//    model.addAttribute("donation", donation);
//        Donation donation1 = donation;
//        donation1.setCategories(convert(categories));
//        donation1.setInstitution(institution);
        System.out.println();
        return "form";
    }

    @ModelAttribute(name = "categories2")
    public List<Category> categoryList(){
        return categoryService.distinctCategoryList();
    }

    @ModelAttribute(name = "Institutions")
    public List<Institution> institutionsList(){
        return institutionService.institutionList();
    }

//    public List<Category> convert(String[] categories){
//        List<String> collect = Arrays.stream(categories).collect(Collectors.toList());
//        List<Category> categoryList = new ArrayList<>();
//        for(String s : collect){
//            categoryList.add(categoryService.findCategoryByName(s));
//        }
//        return categoryList;
//    }
}

