package ua.edu.ucu.OOPMiddle.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import ua.edu.ucu.OOPMiddle.Company.Company;
import ua.edu.ucu.OOPMiddle.DataAccess.CompanyRepository;

import java.util.Optional;

@Service
public class PageService {
    @Autowired
    CompanyRepository companyRepository;
    public Company searchCompany(ModelAndView modelAndView, String domain) {
        Optional<Company> domainOptional = companyRepository
                .findDomenByName(domain);
        if (domainOptional.isEmpty()){
            Company company = parseCompany(domain);
            companyRepository.save(company);
            return company;
        }
        return companyRepository.getByDomain(domain);


        modelAndView.addObject("domain", domain);

    }

    private Company parseCompany(String domain){

    }
//    @Autowired
//    private CompanyRepository companyRepository;
//    public Company processDomain(String domain) {
//        boolean inDatabase = companyRepository.existsByCompanyName(domain);
//        if (inDatabase){
//            return companyRepository.getCompany(domain);
//        }
//
//    }


}
