package pl.coderslab.charity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.coderslab.charity.domain.model.Institution;
import pl.coderslab.charity.domain.repository.InstitutionRepository;
import pl.coderslab.charity.service.InstitutionService;

import java.util.ArrayList;
import java.util.List;

@Component
public class Setup {

    private static InstitutionRepository institutionRepository;

    public Setup(InstitutionRepository institutionRepository) {
        this.institutionRepository = institutionRepository;
    }

    public static void main(String[] args) {
        List<Institution> institutionList = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            Institution institution = new Institution();
            institution.setName("Instytucja " + i);
            institution.setDescription("Opis " + i);
            institutionList.add(institution);
        }
        for(Institution i : institutionList){
            institutionRepository.save(i);
        }
    }
}
