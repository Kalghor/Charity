package pl.coderslab.charity.service;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.domain.repository.DonationRepository;

import java.util.List;

@Service
public class DonationService {

    private DonationRepository donationRepository;

    public DonationService(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    public Long getDonationNumber(){
        return donationRepository.count();
    }

    public List<Integer> getQuantitiesValues(){
        return donationRepository.findQuantitiesValues();
    }
}
