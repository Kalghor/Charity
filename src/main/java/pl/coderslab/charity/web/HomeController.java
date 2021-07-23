package pl.coderslab.charity.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.domain.model.Institution;
import pl.coderslab.charity.service.InstitutionService;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    private InstitutionService institutionService;

    public HomeController(InstitutionService institutionService) {
        this.institutionService = institutionService;
    }

//    @ModelAttribute("numberOfInstitutions")
//    public int numberOfInstitutions() {
//        return institutionService.institutionList().size();
//    }
//
//    @ModelAttribute("institutionListOne")
//    public List<Institution> institutionListOne() {
//        int size = institutionService.institutionList().size();
//
//            return institutionService.institutionList().subList(0, (size - 1) / 2);
//    }
//
//    @ModelAttribute("institutionListTwo")
//    public List<Institution> institutionListTwo() {
//        int size = institutionService.institutionList().size();
//        if(size % 3 == 0) {
//            return institutionService.institutionList().subList((size - 1) / 2, size - 1);
//        } else {
////            int firstIndex = (size - 1) / 2;
//            return institutionService.institutionList().subList((size - 1) / 2, size - 1);
//        }
//    }

    @ModelAttribute("institutionList")
    public List<Institution> institutionList() {
        return institutionService.institutionList();
    }

    @GetMapping("/")
    public String homePage() {
        return "index";
    }

}
