package ua.edu.ucu.OOPMiddle.domens;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DomenRepository extends JpaRepository<Domen, Long> {
//    @Query("SELECT S FROM Domen S WHERE s.name = ?1")
    Optional<Domen> findDomenByName(String name);
}
