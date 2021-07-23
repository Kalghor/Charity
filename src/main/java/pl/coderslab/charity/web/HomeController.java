package pl.coderslab.charity.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.domain.model.Donation;
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


//    @ModelAttribute("institutionList")
//    public List<Institution> institutionList() {
//        return ;
//    }

    @GetMapping("/")
    public String homePage(Model model) {
        List<Donation> donations = donationService.donationList();
        model.addAttribute("numberOfBags", numberOfBags(donations));
        model.addAttribute("numberOfGifts", numberOfGifts(donations));
        model.addAttribute("institutionList", institutionService.institutionList());
        return "index";
    }

    private int numberOfBags(List<Donation> list) {
        int numberOfBags = 0;
        for (Donation d : list) {
            numberOfBags += d.getQuantity();
        }
        return numberOfBags;
    }

    private int numberOfGifts(List<Donation> list) {
        return list.size();
    }
}
