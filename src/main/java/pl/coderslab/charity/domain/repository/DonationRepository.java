package pl.coderslab.charity.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.charity.domain.model.Donation;

@Repository
public interface DonationRepository extends CrudRepository<Donation, Long> {
}
