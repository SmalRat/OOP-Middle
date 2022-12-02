package ua.edu.ucu.OOPMiddle.DataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.edu.ucu.OOPMiddle.Company.CompanyOld;

@Repository
public interface CompanyRepositoryOld extends JpaRepository<CompanyOld, String> {

    /**public Company getCompany() {
        return
    }

    public boolean checkExistence(String domain) {
    }**/
    Boolean existsByCompanyName(String companyName);
}
