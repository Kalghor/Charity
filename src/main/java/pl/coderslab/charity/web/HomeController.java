package pl.coderslab.charity.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.domain.model.Institution;
import pl.coderslab.charity.service.DonationService;
import pl.coderslab.charity.service.InstitutionService;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    private InstitutionService institutionService;
    private DonationService donationService;

    public HomeController(InstitutionService institutionService, DonationService donationService) {
        this.institutionService = institutionService;
        this.donationService = donationService;
    }

    @GetMapping("/")
    public String homePage(Model model) {
        Long donations = donationService.getDonationNumber();
        List<Integer> quantitiesValues = donationService.getQuantitiesValues();
        List<Institution> institutions = institutionService.institutionList();
        model.addAttribute("numberOfBags", getNumberOfGifts(quantitiesValues));
        model.addAttribute("numberOfGifts", donations);
        model.addAttribute("institutionList", institutions);
        model.addAttribute("numberOfInstitutions", institutions.size());
        return "index";
    }

    private int getNumberOfGifts(List<Integer> list) {
        int sum = 0;
        for (Integer i : list){
            sum += i;
        }
        return sum;
    }
}
