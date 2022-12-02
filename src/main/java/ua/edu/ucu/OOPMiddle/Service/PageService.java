package ua.edu.ucu.OOPMiddle.Service;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import ua.edu.ucu.OOPMiddle.Company.Company;
import ua.edu.ucu.OOPMiddle.DataAccess.CompanyRepository;
import ua.edu.ucu.OOPMiddle.Parsers.GooglePlaces;
import ua.edu.ucu.OOPMiddle.Parsers.PDLReader;
import ua.edu.ucu.OOPMiddle.Parsers.BrandfetchParser;

import java.io.IOException;
import java.util.Optional;

@Service
public class PageService {
    @Autowired
    CompanyRepository companyRepository;
    public void searchCompany(ModelAndView modelAndView, String domain) throws UnirestException, JSONException, IOException {
        Optional<Company> domainOptional = companyRepository
                .findDomainByName(domain);
        modelAndView.addObject("domain", domain);
        Company company;
        if (domainOptional.isEmpty()){
            company = parseCompany(domain);
            companyRepository.save(company);
        }
        else{
            company = domainOptional.get();
        }
        //company = companyRepository.getByDomain(domain);
        fillModel(modelAndView, company);
    }

    private void fillModel(ModelAndView modelAndView, Company company){
        modelAndView.addObject("name", company.getName());
        modelAndView.addObject("domain", company.getDomain());
        modelAndView.addObject("twitter", company.getTwitter());
        modelAndView.addObject("facebook", company.getFacebook());
        modelAndView.addObject("logo", company.getLogo());
        modelAndView.addObject("icon", company.getIcon());
        modelAndView.addObject("employees", company.getEmployees());
        modelAndView.addObject("address", company.getAddress());
    }

    private Company parseCompany(String domain) throws UnirestException, JSONException, IOException {
//        List<Class> parsersList = new ArrayList<Class>();
//        parsersList.add(PDLReader.class);
//        parsersList.add(GooglePlaces.class);
//        parsersList.add(Parser.class);
//        for (Class parserClass : parsersList) {
//            Parser parser = parserClass.new;
//        }

        BrandfetchParser brandfetchParser = new BrandfetchParser();
        GooglePlaces googlePlaces = new GooglePlaces();
        PDLReader pdlReader = new PDLReader();

        Company company = new Company();
        company.setDomain(domain);

        brandfetchParser.parseCompany(company);
        googlePlaces.parseCompany(company);
        pdlReader.parseCompany(company);

        return company;
    }

}
