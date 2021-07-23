package pl.coderslab.charity.service;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.domain.model.Donation;
import pl.coderslab.charity.domain.repository.DonationRepository;

import java.util.List;

@Service
public class DonationService {

    private DonationRepository donationRepository;

    public DonationService(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    public List<Donation> donationList(){
        return (List<Donation>) donationRepository.findAll();
    }
}
