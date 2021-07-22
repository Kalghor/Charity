package pl.coderslab.charity.domain.repository;

import org.springframework.data.repository.CrudRepository;
import pl.coderslab.charity.domain.model.Donation;

public interface DonationRepository extends CrudRepository<Donation, Long> {
}
