package pl.coderslab.charity.domain.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.charity.domain.model.Donation;

import java.util.List;

@Repository
public interface DonationRepository extends CrudRepository<Donation, Long> {

    @Query("SELECT d.quantity FROM Donation d")
    List<Integer> findQuantitiesValues();

}
