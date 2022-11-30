package ua.edu.ucu.OOPMiddle.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.edu.ucu.OOPMiddle.Company.Company;
import ua.edu.ucu.OOPMiddle.DataAccess.CompanyRepository;

@Service
public class PageService {
    @Autowired
    private CompanyRepository companyRepository;
    public Company processDomain(String domain) {
        boolean inDatabase = companyRepository.existsByCompanyName(domain);
        if (inDatabase){
            return companyRepository.getCompany(domain);
        }

    }
}
