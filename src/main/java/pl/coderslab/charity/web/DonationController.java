package pl.coderslab.charity.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.charity.domain.model.Category;
import pl.coderslab.charity.domain.model.Donation;
import pl.coderslab.charity.domain.model.Institution;
import pl.coderslab.charity.service.CategoryService;
import pl.coderslab.charity.service.DonationService;
import pl.coderslab.charity.service.InstitutionService;

import javax.validation.Valid;
import java.util.List;

@Controller
public class DonationController {

    private CategoryService categoryService;
    private InstitutionService institutionService;
    private DonationService donationService;

    public DonationController(CategoryService categoryService, InstitutionService institutionService, DonationService donationService) {
        this.categoryService = categoryService;
        this.institutionService = institutionService;
        this.donationService = donationService;
    }

    @GetMapping("/addGift")
    public String prepareAddGift(Model model){
        model.addAttribute("donation", new Donation());
        return "form";
    }

    @PostMapping("/addGift")
    public String processAddGift(@Valid Donation donation, BindingResult bindingResult, Model model, @RequestParam Institution institution, @RequestParam String[] categories){
        donationService.saveDonation(donation);
        return "redirect:/confirm";
    }

    @ModelAttribute(name = "categories2")
    public List<Category> categoryList(){
        return categoryService.distinctCategoryList();
    }

    @ModelAttribute(name = "Institutions")
    public List<Institution> institutionsList(){
        return institutionService.institutionList();
    }

}

