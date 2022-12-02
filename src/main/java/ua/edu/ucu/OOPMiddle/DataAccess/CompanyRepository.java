package ua.edu.ucu.OOPMiddle.DataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.edu.ucu.OOPMiddle.Company.Company;

import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
//    @Query("SELECT S FROM Domen S WHERE s.name = ?1")
    Optional<Company> findDomenByName(String name);
}
